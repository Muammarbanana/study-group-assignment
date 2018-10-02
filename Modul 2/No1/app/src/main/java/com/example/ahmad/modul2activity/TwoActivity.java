package com.example.ahmad.modul2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Log.d("Halo", "-------"); Log.d("Saya lagi di", "onCreate");
    }

    public void send(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = et.getText().toString();
        intent.putExtra("pesan_saya", message);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Saya lagi di", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Saya lagi di", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Saya lagi di", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Saya lagi di", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Saya lagi di", "onRestart");
    }
}
