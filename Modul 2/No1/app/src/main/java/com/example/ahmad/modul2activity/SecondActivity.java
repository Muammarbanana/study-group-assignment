package com.example.ahmad.modul2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et2 = findViewById(R.id.et2);
        Intent intent = getIntent();
        String message = intent.getStringExtra("pesan_saya");
        TextView textView = (TextView) findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void reply(View view) {
        Intent intent = new Intent(this, TwoActivity.class);
        String message = et2.getText().toString();
        intent.putExtra("pesan_saya", message);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void portal(View view) {
        Intent intent = new Intent(this, Kalkulator.class);
        startActivity(intent);
    }
}
