package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.myapplication.MainActivity3.countonclick;

public class MainActivity5 extends AppCompatActivity {
    public String Nbrclick="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent intent = getIntent();
        if (intent != null)
            if (intent.hasExtra("Nbrclick"))
                Nbrclick = intent.getStringExtra("Nbrclick");

        final TextView textView17 = findViewById(R.id.textView17);
        final Button button8 = findViewById(R.id.button8);
        final Button button11 = findViewById(R.id.button11);

            textView17.setText(Nbrclick);
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
                Intent e = new Intent(getBaseContext(), MainActivity.class);
                e.putExtra("Nbrclick",Nbrclick);
                startActivity(e);
            }
        });

    }
}