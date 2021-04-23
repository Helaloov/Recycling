package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Shape selectedShape;
    WebView wr;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSelectedShape();


    }

    private void getSelectedShape()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedShape = All_Container.shapeList.get(Integer.valueOf(parsedStringID));

        wr = findViewById(R.id.wr);
        textView =  findViewById(R.id.shapeName);

        String[] StadtParts = selectedShape.getName().split(",");
        String[] AdressParts = selectedShape.getAdress().split(",");
        textView.setText("Stadt: "+ StadtParts[0]+ "\nArt:    " + StadtParts[1] + "\nStraße: "+AdressParts[1] + "\nAnbieter: " + selectedShape.getAnbieter());
        wr.setWebViewClient(new WebViewClient());
        WebSettings tebSettings = wr.getSettings();
        tebSettings.setJavaScriptEnabled(true);

        wr.loadUrl("file:///android_asset/" + selectedShape.getId() + ".html");
    }


}