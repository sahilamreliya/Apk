package com.example.a10peg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class three extends AppCompatActivity {


    View addtocart;
    View buynow;
    textView   name,rate,dilevery,ret,size,numbar,namee,cloth,compny,dijain;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        addtocart = findViewById(R.id.btn1);
        buynow = findViewById(R.id.btn2);

       addtocart.setOnClickListener(new view.onclicklistener()

    }
}