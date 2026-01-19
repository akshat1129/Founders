package com.example.founders;

public class MyListData {

    private String name;
    private String description;
    private int imageId;

    public MyListData(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }
}
