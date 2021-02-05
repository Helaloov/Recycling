package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button Nachricht;
    public Button Container;
    public Button Abschnitt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Intents
        final Intent nachricht = new Intent(this, Email.class );
        final Intent abschnitt2_Kleidung = new Intent(this, Abschnitt2_Kleidung.class );
        final Intent container = new Intent(this, All_Container.class );


        Nachricht = (Button) findViewById(R.id.button3);
        Container = (Button) findViewById(R.id.button1);
        Abschnitt2= (Button) findViewById(R.id.button2);





        Container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(container);
            }
        });
        Nachricht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nachricht);
            }
        });
        Abschnitt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(abschnitt2_Kleidung);
            }
        });
    }




}