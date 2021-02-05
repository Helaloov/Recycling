package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Abschnitt2_Kleidung extends AppCompatActivity {

    Button Umfrage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abschnitt2__kleidung);

        final Intent umfrage = new Intent(this, Umfrage.class);

        Umfrage = (Button) findViewById(R.id.button6);

        Umfrage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(umfrage);
            }
        });


    }
}