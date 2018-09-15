package com.example.dell.ias5;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class motivation extends AppCompatActivity {
 ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        imageView=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r;
                Random random= new Random();
                r=random.nextInt(9);
                switch (r)
                {
                    case 0:imageView.setImageResource(R.drawable.img1);break;
                    case 1:imageView.setImageResource(R.drawable.img2);break;
                    case 2:imageView.setImageResource(R.drawable.img3);break;
                    case 3:imageView.setImageResource(R.drawable.img9);break;
                    case 4:imageView.setImageResource(R.drawable.img8);break;
                    case 5:imageView.setImageResource(R.drawable.img7);break;
                    case 6:imageView.setImageResource(R.drawable.img6);break;
                    case 7:imageView.setImageResource(R.drawable.img5);break;
                    case 8:imageView.setImageResource(R.drawable.img4);break;
                    case 9:imageView.setImageResource(R.drawable.img10);break;

                    default:
                            imageView.setImageResource(R.drawable.img11);break;

                }
            }
        });


    }


}
