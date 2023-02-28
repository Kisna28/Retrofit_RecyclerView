package com.example.retrofit;

public class Usermodel {
    int img_src;
    int id;

    public Usermodel(int img_src, int id) {
        this.img_src = img_src;
        this.id = id;
    }

    public int getImg_src() {
        return img_src;
    }

    public void setImg_src(int img_src) {
        this.img_src = img_src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
