package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    int count=0;
     Button addition;
     Button subtraction;
     Button reset;
     TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.bell);
      addition=(Button) findViewById(R.id.addition);
      addition.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              count++;
              if(count==10||count==20||count==30||count==40||count==50||count==60||count==70||count==80||count==90||count==100)
              {
                  mp.start();
              }
              text=(TextView) findViewById(R.id.text);
              text.setTextColor(Color.GREEN);
              text.setText(count+"");
          }
      });

      subtraction=(Button) findViewById(R.id.subtraction);
      subtraction.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(count==0)
              {
                  Toast.makeText(getApplicationContext(),"Add first then subtract", Toast.LENGTH_SHORT).show();
              }
              else {
                  count--;
                  text = (TextView) findViewById(R.id.text);
                  text.setTextColor(Color.RED);
                  text.setText(count + "");
              }
          }
      });

        reset=(Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                text=(TextView) findViewById(R.id.text);
                text.setText(count+"");
            }
        });
    }
}