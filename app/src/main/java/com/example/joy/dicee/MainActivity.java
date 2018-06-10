package com.example.joy.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=findViewById(R.id.rollbutton);
        final ImageView leftdice=findViewById(R.id.image_leftdice);
        final ImageView rightdice=findViewById(R.id.image_rightdice);

        final int[] dicearray = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Button has been pressed");
                Random randomnumber=new Random();
                int number=randomnumber.nextInt(6);
                Log.d("Dicee","the random Number is:" +number);
                leftdice.setImageResource(dicearray[number]);

                number = randomnumber.nextInt(6);
                rightdice.setImageResource(dicearray[number]);
            }
        });
    }
}
