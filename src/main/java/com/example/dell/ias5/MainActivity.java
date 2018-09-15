package com.example.dell.ias5;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this,"Let's start with the introduction..",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,basic.class);
                startActivity(i);
            }
        });
        b3=(Button)findViewById(R.id.b3);
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Time to know about some books..",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,book.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Don't lose hope..",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,motivation.class);
                startActivity(i);
            }
        });
    }
}
