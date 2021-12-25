package com.example.rimaapi;

import java.io.Serializable;

public class DataCenter implements Serializable {
    String nama, website, deskripsi, image, cthKode;

    public DataCenter(String nama, String website, String deskripsi, String image, String cthKode) {
        this.nama = nama;
        this.website = website;
        this.deskripsi = deskripsi;
        this.image = image;
        this.cthKode = cthKode;
    }

    public String getNama() {
        return nama;
    }

    public String getWebsite() {
        return website;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getImage() {
        return image;
    }

    public String getCthKode() {
        return cthKode;
    }
}
