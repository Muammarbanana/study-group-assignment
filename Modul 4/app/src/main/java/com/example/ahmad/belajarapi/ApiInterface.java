package com.example.ahmad.belajarapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ahmad on 11/23/18.
 */

public interface ApiInterface {
    @GET("search")
    public Call<Response> getRecipe(@Query("q") String query,
                                    @Query("app_id") String appId,
                                    @Query("app_key") String appKey
    );
}
