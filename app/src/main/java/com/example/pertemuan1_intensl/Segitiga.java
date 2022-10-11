package com.example.pertemuan1_intensl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.CollationElementIterator;

public class Segitiga extends AppCompatActivity {
    EditText input_alas,input_tinggi;
    Button hitungluas;
    TextView hasilhitung;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        input_alas = (EditText)findViewById(R.id.input_alas);
        input_tinggi = (EditText)findViewById(R.id.input_tinggi);
        hitungluas = (Button) findViewById(R.id.hitungluas);
        hasilhitung = (TextView)findViewById(R.id.hasilhitung);
        hitungluas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(input_alas.length()==0 && input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if (input_alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else if (input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = input_alas.getText().toString();
                    String isitinggi = input_tinggi.getText().toString();
                    double input_alas = Double.parseDouble(isialas);
                    double input_tinggi = Double.parseDouble(isitinggi);
                    double hasil = LuasSegitiga(input_alas,input_tinggi);
                    String output = String.valueOf(hasilhitung);
                    CollationElementIterator hasilluas;
                    hasilhitung.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double input_alas, double input_tinggi){return input_alas*input_tinggi/2;}
}