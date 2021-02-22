package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public String Nbrclick="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        if (intent != null)
            if (intent.hasExtra("Nbrclick"))
                Nbrclick = intent.getStringExtra("Nbrclick");

        final TextView textView12 = findViewById(R.id.textView12);

        textView12.setText(Nbrclick);
    }
}