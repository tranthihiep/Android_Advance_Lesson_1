package com.haha.recyclerview;

/**
 * Created by trant on 03/01/2018.
 */

public class DataHero
{
    private int image;
    private String name;

    public DataHero(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
