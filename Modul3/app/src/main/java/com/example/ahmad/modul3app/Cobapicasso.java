package com.example.ahmad.modul3app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Cobapicasso extends AppCompatActivity {

    private ImageView mIvCardImage;
    private String mPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobapicasso);

        mPath = "https://maxcdn.icons8.com/app/uploads/2016/03/material-1-1000x563.jpg";
        mIvCardImage = findViewById(R.id.iv_card_image);

        Picasso.get().load(mPath).fit().centerCrop().into(mIvCardImage);
    }
}
