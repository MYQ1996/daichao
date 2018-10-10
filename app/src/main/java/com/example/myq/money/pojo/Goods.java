package com.example.myq.money.pojo;

public class Goods {
    /**
     * 名字
     */
    private String name;
    private String price;
    private String time;
    /**
     * 图片 ID
     */
    private int imageId;

    public Goods(String name,String price,String time,int imageId) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public int getImageId() {
        return imageId;
    }
}
