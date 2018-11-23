package com.example.ahmad.belajarapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmad on 11/23/18.
 */

public class Response {
    @SerializedName("q")
    private String query;
    @SerializedName("hits")
    private List<Hits> hits = new ArrayList<>();

    public String getQuery() {
        return query;
    }

    public List<Hits> getHits() {
        return hits;
    }
}
