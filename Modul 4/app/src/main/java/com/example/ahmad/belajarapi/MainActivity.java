package com.example.ahmad.belajarapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    ResepAdapter adapter;
    private List<Resep> listResep = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ResepAdapter(listResep);
        RecyclerView recyclerView = findViewById(R.id.listResep);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loadData();
    }

    private void loadData(){
        //Resep resep = new Resep("https://img-global.cpcdn.com/003_recipes/7ac31bcd8b05a075/751x532cq70/photo.jpg", "Pelecing Kangkung", "100 Calories");
        //listResep.add(resep);
        //adapter.notifyDataSetChanged();

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Response> call = apiService.getRecipe("chicken", "9bb5eb17", "a658bf7a755995dcf8644d6ac1ccb091");
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response>call, retrofit2.Response<Response> response) {
                List<Hits> hits = response.body().getHits();
                listResep.clear();
                for (int i=0;i<hits.size();i++) {
                    Resep resepServer = hits.get(i).getResep();
                    listResep.add(resepServer);
                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<Response>call, Throwable t) {
                Log.e("Request Failure", t.getMessage());
            }
        });
    }
}
