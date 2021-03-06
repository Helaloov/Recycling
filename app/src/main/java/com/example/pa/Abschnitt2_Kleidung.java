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
    Button Allg_Inf;
    Button Bewertung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abschnitt2__kleidung);

        final Intent h_Fragen = new Intent(this, HaufigeFragen.class);
        final Intent allg_inf = new Intent(this, Allgemeine_Infos.class);
        final Intent statistiken = new Intent(this, Statistiken.class);
        final Intent quiz = new Intent(this, Quiz.class);
        final Intent umfrage = new Intent(this, Umfrage.class);
        final Intent bewertung = new Intent(this, Meinung.class);


        H_Fragen = (Button) findViewById(R.id.button1);
        Umfrage = (Button) findViewById(R.id.button2);
        Allg_Inf = (Button) findViewById(R.id.button3);
        Statistiken = (Button) findViewById(R.id.button4);
        Quiz    = (Button) findViewById(R.id.button5);
        Bewertung = (Button) findViewById(R.id.button6);


        H_Fragen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(h_Fragen);
            }
        });

        Allg_Inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(allg_inf);
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

        Bewertung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(bewertung);
            }
        });



    }
}