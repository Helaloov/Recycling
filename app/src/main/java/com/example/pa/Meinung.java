package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Meinung extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editText;
    Button button;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meinung);

        final Intent HS = new Intent(this, Danke.class);

        radioGroup = findViewById(R.id.groupOne);
        radioButton = findViewById(R.id.a);
        editText = findViewById(R.id.zusatz);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
                startActivity(HS);

            }
        });
    }

    private void sendMail() {
        String mail = "helal.alsabbagh.syr@gmail.com";
        String message = "Bewertung: " + id + "\n\nNachricht vom Benutzer: " + editText.getText().toString() ;
        String subject = "Bewertung";

        JavaMailApi javaMailAPI = new JavaMailApi(this,mail,subject,message);

        javaMailAPI.execute();

    }

    public void onRadioButtonClicked(View view) {

        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        id = radioButton.getText().toString();

    }
}


