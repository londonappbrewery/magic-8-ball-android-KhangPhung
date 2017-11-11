package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button askButton;
    ImageView ballImage;
    Random ballRandom = new Random();
    int[] ballArrays;

//    Button askButton;
//    int[] ballArrays = new int[]{
//            R.drawable.ball1,
//            R.drawable.ball2,
//            R.drawable.ball3,
//            R.drawable.ball4,
//            R.drawable.ball5
//    };
//    Random mRandom = new Random();
//    int myNumber;
//    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballArrays = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        ballImage = (ImageView) findViewById(R.id.image_eightball);
        askButton = (Button) findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numberChange;
                numberChange = ballRandom.nextInt(5);
                ballImage.setImageResource(ballArrays[numberChange]);

            }
        });
//        askButton = (Button) findViewById(R.id.askButton);
//        image = (ImageView) findViewById(R.id.image_eightball);
//        askButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("button","taped");
//                myNumber = mRandom.nextInt(5);
//                image.setImageResource(ballArrays[myNumber]);
//            }
//        });
    }

}
