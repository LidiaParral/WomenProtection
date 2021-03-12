package com.dam.womenprotection.Adapter;

public class MVHelperClass {

    int image;
    String title;
    String descrip;

    public MVHelperClass(int image, String title, String descrip) {
        this.image = image;
        this.title = title;
        this.descrip = descrip;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescrip() {
        return descrip;
    }


}
