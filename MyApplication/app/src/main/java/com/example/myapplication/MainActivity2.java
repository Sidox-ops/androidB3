package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

//import static com.example.myapplication.MainActivity3.countonclick;

public class MainActivity2 extends AppCompatActivity {
    public String Nbrclick="0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if (intent != null)
            if (intent.hasExtra("Nbrclick"))
                Nbrclick = intent.getStringExtra("Nbrclick");

        final TextView textView3 = findViewById(R.id.textView3);
        final Button button4 = findViewById(R.id.button4);
        final Button button6 = findViewById(R.id.button6);


        textView3.setText(Nbrclick);

        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Changer de page
                Intent j = new Intent(getBaseContext(), MainActivity3.class);
                startActivity(j);
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Changer de page
                Intent j = new Intent(getBaseContext(), Register.class);
                startActivity(j);
            }
        });
    }
}