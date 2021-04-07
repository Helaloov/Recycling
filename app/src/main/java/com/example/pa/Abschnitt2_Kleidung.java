package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Abschnitt2_Kleidung extends AppCompatActivity {

    Button H_Fragen;
    Button Statistiken;
    Button Quiz;
    Button Umfrage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abschnitt2__kleidung);

        final Intent h_Fragen = new Intent(this, HaufigeFragen.class);
        final Intent statistiken = new Intent(this, Statistiken.class);
        final Intent quiz = new Intent(this, Quiz.class);
        final Intent umfrage = new Intent(this, Umfrage.class);

        H_Fragen = (Button) findViewById(R.id.button3);
        Statistiken = (Button) findViewById(R.id.button4);
        Quiz    = (Button) findViewById(R.id.button5);
        Umfrage = (Button) findViewById(R.id.button6);

        H_Fragen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(h_Fragen);
            }
        });

        Statistiken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(statistiken);
            }
        });

        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(quiz);
            }
        });

        Umfrage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(umfrage);
            }
        });


    }
}