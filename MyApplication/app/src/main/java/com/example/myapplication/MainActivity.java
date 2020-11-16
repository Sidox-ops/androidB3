package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int countonclick=0;
    public String Nbrclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                countonclick++;
                //Nbrclick = Integer.toString(countonclick);
                Nbrclick = String.valueOf(countonclick);
                Context context = getApplicationContext();
                button2.setText(Nbrclick);
                /*CharSequence text = "Tu as cliqué Sidox !";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, Nbrclick, duration);
                toast.show();*/
             //Changer de page
                //Intent i = new Intent(getBaseContext(), MainActivity2.class);
                //startActivity(i);
            }
        });
    }

    public void showClick (View view){
        Context context = getApplicationContext();
        CharSequence text = "Tu as cliqué Sidox !";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    //public static void main (String [] args)
    //{
        //System.out.println(countonclick);
    //}
}