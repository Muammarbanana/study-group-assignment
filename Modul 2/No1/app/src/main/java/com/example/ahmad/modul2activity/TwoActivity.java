package com.example.ahmad.modul2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        et = findViewById(R.id.et);
        Intent intent = getIntent();
        String message = intent.getStringExtra("pesan_saya");
        TextView textView = (TextView) findViewById(R.id.text_message2);
        textView.setText(message);
    }

    public void send(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = et.getText().toString();
        intent.putExtra("pesan_saya", message);
        startActivity(intent);
    }
}
