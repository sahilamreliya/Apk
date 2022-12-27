package com.example.a10peg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class two<imageview, textview> extends AppCompatActivity {


    imagebutton  kurti1,kurti2,kurti3,menpent,funkipent,hudi,listip,kids,frocks;
    textview  name1;
    textview name2;
    textview name3;
    textview name4;
    textview name5;
    textview name6;
    textview name7;
    textview name8;
    textview name9;
    textview bhav1;
    textview bhav2;
    textview bhav3;
    textview bhav4;
    textview bhav5;
    textview bhav6;
    textview bhav7;
    textview bhav8;
    textview bhav9;
    textview fd1;
    textview fd2;
    View fd3;
    textview fd4;
    textview fd5;
    textview fd6;
    textview fd7;
    textview fd8;
    textview fd9;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        kurti1 =  findViewById(R.id.line1);
        kurti2 =  findViewById(R.id.line3);
        kurti3 =  findViewById(R.id.line4);
        menpent =  findViewById(R.id.line5);
        funkipent =  findViewById(R.id.line7);
        hudi =  findViewById(R.id.line9);
        listip =findViewById(R.id.line10);
        frocks =  findViewById(R.id.line11);
        bhav1 = (textview) findViewById(R.id.dl1);
        bhav2 = (textview) findViewById(R.id.dl2);
        bhav3 = (textview) findViewById(R.id.dl3);
        bhav4 = (textview) findViewById(R.id.dl4);
        bhav5 = (textview) findViewById(R.id.dl5);
        bhav6 = (textview) findViewById(R.id.dl7);
        bhav7 = (textview) findViewById(R.id.dl9);
        bhav8 = (textview) findViewById(R.id.dl10);
        name1 = (textview) findViewById(R.id.kurti1);
        name2= (textview) findViewById(R.id.kurti2);
        name3 = (textview) findViewById(R.id.kurti3);
        name4 = (textview) findViewById(R.id.kurti4);
        name5 = (textview) findViewById(R.id.kurti5);
        name6 = (textview) findViewById(R.id.kurti7);
        name7 = (textview) findViewById(R.id.kurti9);
        name8 = (textview) findViewById(R.id.kurti10);
     fd1  = (textview) findViewById(R.id.fd1);
     fd2  = (textview) findViewById(R.id.fd2);
     fd3  = findViewById(R.id.fd3);
     fd4  = (textview) findViewById(R.id.fd4);
     fd5  = (textview) findViewById(R.id.fd5);
     fd6  = (textview) findViewById(R.id.fd7);
     fd7  = (textview) findViewById(R.id.fd9);
     fd9  = (textview) findViewById(R.id.fd10);


       imagebutton.setonclicklisstener(new onclicklistener())
   

    }

    
}