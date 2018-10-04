package com.example.android.navexample;

public class AboutUsFlavor {
    private String name;
    private String designation;
    private int imageId;

    public AboutUsFlavor(String name, String designation, int imageId) {
        this.name = name;
        this.designation = designation;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getImageId() {
        return imageId;
    }
}
