package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nachricht extends AppCompatActivity {

    public EditText mSubjekt;
    public EditText mMessage ;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nachricht);


        mSubjekt =  (EditText) findViewById(R.id.subjektID);
        mMessage =  (EditText) findViewById(R.id.messageID);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
            }
        });
    }

    private void sendMail() {
        String mail = "helal.alsabbagh.syr@gmail.com";
        String message = mMessage.getText().toString().trim();
        String subject = mSubjekt.getText().toString().trim();

        JavaMailApi javaMailAPI = new JavaMailApi(this,mail,subject,message);

        javaMailAPI.execute();

    }
}