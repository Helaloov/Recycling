package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Email extends AppCompatActivity {

    public Button container;
    public Button shop;
    public Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        final Intent Container = new Intent(this, Container_Vorschlag.class );
        final Intent Shop = new Intent(this, sec_Hand_Shop_Vorschlag.class );
        final Intent Email = new Intent(this, Nachricht.class );

        container = (Button) findViewById(R.id.button1);
        shop  = (Button) findViewById(R.id.button2);
        email = (Button) findViewById(R.id.button3);



        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Container);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Shop);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(Email);
            }
        });


    }
}