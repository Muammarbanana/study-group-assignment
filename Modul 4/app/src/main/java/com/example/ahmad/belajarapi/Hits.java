package com.example.ahmad.belajarapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmad on 11/23/18.
 */

public class Hits {
    @SerializedName("recipe")
    private Resep resep;

    public Resep getResep() {
        return resep;
    }
}
