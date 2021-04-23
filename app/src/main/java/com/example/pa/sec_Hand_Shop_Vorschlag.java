package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sec_Hand_Shop_Vorschlag extends AppCompatActivity {

    public EditText strasse;
    public EditText nr ;
    public EditText stadt;
    public EditText plz;
    public EditText zusatz;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec__hand__shop__vorschlag);

        strasse=  (EditText) findViewById(R.id.strasse);
        nr     =  (EditText) findViewById(R.id.nr);
        stadt  =  (EditText) findViewById(R.id.stadt);
        plz    =  (EditText) findViewById(R.id.plz);
        zusatz =  (EditText) findViewById(R.id.zusatz);
        final Intent HS = new Intent(this, Danke.class);



        button = (Button) findViewById(R.id.button);

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
        String message = "Straße: " + strasse.getText().toString().trim()
                + "    " + nr.getText().toString().trim() + "\n" +
                "Stadt: " + plz.getText().toString().trim() + "    "
                + stadt.getText().toString().trim() + "\n \n"
                + zusatz.getText().toString().trim();
        String subject = "Second-Hand-Shop/Vorschlag";

        JavaMailApi javaMailAPI = new JavaMailApi(this,mail,subject,message);

        javaMailAPI.execute();

    }
}