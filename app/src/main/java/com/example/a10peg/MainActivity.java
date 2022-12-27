package com.example.a10peg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Object delaymillis;
        new handler().postdelayed(new runnable(){
            @Override
            public <spalashactivity> void run(){
                intent intent =new intent (spalashactivity.this,mainactivity.class);
                startactivity (  intent );
            }

            private void startactivity(intent intent) {
            }
        }, delaymillis: 3000);
    }}