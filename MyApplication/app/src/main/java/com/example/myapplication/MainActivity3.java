package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    public static int go=0;
    public static int ready=0;
    public static int timer=0;
    public static int countonclick=0;
    public String Nbrclick;
    public CountDownTimer timer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        countonclick = 0;
        timer=0;
        go=10;
        ready = 3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button7 = findViewById(R.id.button7);
        final TextView textView5 = findViewById(R.id.textView5);
        final ImageView imageView4 = findViewById(R.id.imageView4);
        final TextView textViewchrono = findViewById(R.id.textViewchrono);
        textView5.setVisibility(View.GONE);
        timer2 = new CountDownTimer(10 * 1000, 1000)
        {
            public void onTick(long millisUntilFinished)
            {
                int seconds = ((int) (millisUntilFinished / 1000)+1);
                textView5.setText(String.valueOf(seconds));
            }
            public void onFinish() {
                Intent i = new Intent(getBaseContext(), MainActivity5.class);
                startActivity(i);
            }
        };

        {
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageView4.setVisibility(View.GONE);
                    textView5.setVisibility(View.VISIBLE);
                    textViewchrono.setText("Quick");
                    if (timer==0)
                    {
                        timer2.start();
                        timer=1;
                    }
                    countonclick++;
                    //Nbrclick = Integer.toString(countonclick);
                    Nbrclick = String.valueOf(countonclick);
                    Context context = getApplicationContext();
                    button7.setText(Nbrclick);
                }
            });
        }
    }
}