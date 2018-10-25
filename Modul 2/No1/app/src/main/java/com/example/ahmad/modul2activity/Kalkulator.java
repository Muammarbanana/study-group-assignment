package com.example.ahmad.modul2activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText first,second;
    String bil1,bil2;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        tx = findViewById(R.id.hasil);
        bil1 = first.getText().toString();
        bil2 = second.getText().toString();
    }

    public void add(View view) {
        double a,b;
        a = Double.parseDouble(bil1);
        b = Double.parseDouble(bil2);
        tx.setText(String.valueOf(a+b));
    }

    public void sub(View view) {
        double a,b;
        a = Double.valueOf(bil1);
        b = Double.valueOf(bil2);
        tx.setText(String.valueOf(a+b));
    }

    public void div(View view) {
        double a,b;
        a = Double.valueOf(bil1);
        b = Double.valueOf(bil2);
        tx.setText(String.valueOf(a/b));
    }

    public void mul(View view) {
        double a,b;
        a = Double.valueOf(bil1);
        b = Double.valueOf(bil2);
        tx.setText(String.valueOf(a*b));
    }
}
