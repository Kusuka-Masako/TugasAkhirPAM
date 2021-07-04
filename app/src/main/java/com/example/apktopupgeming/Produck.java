package com.example.apktopupgeming;

public class Produck  {

    private String name ;
    private String price;
    private String desk;
    private String textdesk;
    private int image;

    public Produck(String name, String price, String desk, String textdesk, int image) {

        this.name = name;
        this.image = image;
        this.price = price;
        this.desk = desk;
        this.textdesk = textdesk;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesk(){ return desk;}

    public void setDesk(String desk) {this.desk = desk;}

    public String getTextdesk(){ return textdesk;}

    public void setTextdesk(String textdesk) {this.textdesk = textdesk;}
}