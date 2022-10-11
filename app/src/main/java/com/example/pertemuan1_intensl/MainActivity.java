package com.example.pertemuan1_intensl;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void biodata(View bio){
        Intent a = new Intent(MainActivity.this,Segitiga.class);
        startActivity(a);
    }
    public void segitiga(View seg){
        Intent b = new Intent(MainActivity.this,Segitiga.class);
        startActivity(b);
    }
}