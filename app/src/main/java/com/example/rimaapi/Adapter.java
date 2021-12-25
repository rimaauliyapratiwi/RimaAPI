package com.example.rimaapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rimaapi.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    ArrayList<com.example.rimaapi.DataCenter> dataCenters = new ArrayList();
    LayoutInflater layoutInflater;
    Context context;

    public Adapter(Context context, ArrayList<com.example.rimaapi.DataCenter> data) {
        super(context, R.layout.row_custome_list, data);
        this.dataCenters = data;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.row_custome_list, parent, false);
        com.example.rimaapi.DataCenter data = this.dataCenters.get(position);
        ImageView imageView = convertView.findViewById(R.id.imgList);

        Glide
                .with(context)
                .load(data.getImage())
                .into(imageView);

        return convertView;
    }

}
