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
    public Button locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Intents
        final Intent nachricht = new Intent(this, Email.class );
        final Intent locatin = new Intent(this, Location.class );
        final Intent Container = new Intent(this, All_Container.class );


        Nachricht = (Button) findViewById(R.id.button3);
        locations = (Button) findViewById(R.id.button1);


        Nachricht.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(nachricht);
           }
       });

        locations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Container);
            }
        });
    }




}