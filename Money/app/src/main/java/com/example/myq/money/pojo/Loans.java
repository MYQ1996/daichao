package com.example.myq.money.pojo;

public class Loans {
    /**
     * 名字
     */
    private String name;
    /**
     * 图片 ID
     */
    private int imageId;

    public Loans(String name,int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
