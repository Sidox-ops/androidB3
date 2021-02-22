package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public String Nbrclick="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null)
            if (intent.hasExtra("Nbrclick"))
                Nbrclick = intent.getStringExtra("Nbrclick");

        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
             //Changer de page
                Intent i = new Intent(getBaseContext(), MainActivity2.class);
                i.putExtra("Nbrclick",Nbrclick);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Changer de page
                Intent i = new Intent(getBaseContext(), MainActivity4.class);
                i.putExtra("Nbrclick",Nbrclick);
                startActivity(i);
            }
        });
    }
}