package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.myapplication.MainActivity3.countonclick;

public class MainActivity5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final TextView textView17 = findViewById(R.id.textView17);
        final Button button8 = findViewById(R.id.button8);
        final Button button11 = findViewById(R.id.button11);
        final TextView textView3 = findViewById(R.id.textView3);
        textView17.setText(String.valueOf(countonclick));
        textView3.setText(String.valueOf(countonclick));
        button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Changer de page
                Intent j = new Intent(getBaseContext(), MainActivity3.class);
                startActivity(j);
            }
        });
        button11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Changer de page
                Intent j = new Intent(getBaseContext(), MainActivity.class);
                startActivity(j);
            }
        });

    }
}