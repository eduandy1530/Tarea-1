package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String FullName;
    String Apellido;
    String Genero;
    String ck1;
    String ck2;
    String ck3;
    String ck4;
    String ck5;
    String ck6;
    String LikeN;
    String LikeY;
    String Date;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        Intent intent = getIntent();
        FullName = intent.getStringExtra("Full_Name");
        Apellido = intent.getStringExtra("Last_Name");
        Genero = intent.getStringExtra("Genero");
        Date = intent.getStringExtra("Date");
        ck1 = intent.getStringExtra("ck1");
        ck2 = intent.getStringExtra("ck2");
        ck3 = intent.getStringExtra("ck3");
        ck4 = intent.getStringExtra("ck4");
        ck5 = intent.getStringExtra("ck5");
        ck6 = intent.getStringExtra("ck6");
        LikeN = intent.getStringExtra("LikeN");
        LikeY = intent.getStringExtra("LikeY");
        textView5.setText(FullName + " " + Apellido );
        textView6.setText(Date);
        textView7.setText(Genero);
        textView8.setText(LikeN + LikeY);
        textView10.setText(ck1 + "," + ck2 + "," + ck3 + "," + ck5 + "," + ck6);
    }
}