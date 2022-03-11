package com.example.actividad_8;

public class Data {

    private String name,price,website;
    private int imageId;
    public Data(){}

    public Data(String name,String price,int imageId, String website){
        this.name = name;
        this.price = price;
        this.website = website;
        this.imageId = imageId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //website
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    //website

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}
