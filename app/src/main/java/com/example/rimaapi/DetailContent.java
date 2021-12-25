package com.example.rimaapi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailContent extends AppCompatActivity {

    com.example.rimaapi.DataCenter dataCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_content);

        Intent intent = getIntent();
        dataCenter = (com.example.rimaapi.DataCenter) intent.getSerializableExtra("DATASELECTED");

        inisialisasi();
    }

    void inisialisasi() {
        ImageView img = findViewById(R.id.imgDetail);
        TextView title = findViewById(R.id.titleDetail),
                link = findViewById(R.id.linkDetail),
                desc = findViewById(R.id.descDetail),
                helloWorld = findViewById(R.id.helloworld);

        title.setText(dataCenter.getNama());
        link.setText(dataCenter.getWebsite());
        desc.setText(dataCenter.getDeskripsi());
        helloWorld.setText(dataCenter.getCthKode());
        Glide
                .with(this)
                .load(dataCenter.getImage())
                .into(img);
    }

    public void toLink(View v) {
        Intent intent = new Intent();
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(dataCenter.getWebsite()));
        startActivity(intent);
    }
}
