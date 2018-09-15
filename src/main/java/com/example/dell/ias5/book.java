package com.example.dell.ias5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class book extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,history.class);
                startActivity(i);
            }
        });

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,geography.class);
                startActivity(i);
            }
        });

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,economics.class);
                startActivity(i);
            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,civics.class);
                startActivity(i);
            }
        });

        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,science.class);
                startActivity(i);
            }
        });

        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_LONG).show();
                Intent i = new Intent(book.this,sociology.class);
                startActivity(i);
            }
        });
    }
}
