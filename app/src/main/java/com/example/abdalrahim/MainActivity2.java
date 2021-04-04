package com.example.abdalrahim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("EDT1");
        String data2 = intent.getStringExtra("EDT2");
        String data3 = intent.getStringExtra("EDT3");
        String data4 = intent.getStringExtra("EDT4");
        String data5 = intent.getStringExtra("Gender");
        String data6 = intent.getStringExtra("spinner");


        TextView two1 = findViewById(R.id.tx1);
        TextView two2 = findViewById(R.id.tx2);
        TextView two3 = findViewById(R.id.tx3);
        TextView two4 = findViewById(R.id.tx4);
        TextView two5 = findViewById(R.id.tx5);
        TextView two6 = findViewById(R.id.tx6);


        two1.setText("Your name is: "+data1);
        two2.setText("Your email is: "+data2);
        two3.setText("Your password is: "+data3);
        two4.setText("Your contact number is: "+data4);
        two5.setText("Your gender is "+data5);
        two6.setText("Your prefered language is: "+data6);


    }
}