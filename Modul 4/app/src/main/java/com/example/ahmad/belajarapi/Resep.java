package com.example.ahmad.belajarapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmad on 11/23/18.
 */

public class Resep {
    @SerializedName("image")
    private String image;
    @SerializedName("label")
    private String title;
    @SerializedName("calories")
    private String calories;

    public Resep(String image, String title, String calories) {

        this.image = image;
        this.title = title;
        this.calories = calories;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getCalories() {
        return calories;
    }
}
