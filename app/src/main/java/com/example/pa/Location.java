package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Location extends AppCompatActivity {


    WebView wr ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


        wr = findViewById(R.id.wr);

        wr.setWebViewClient(new WebViewClient());
        WebSettings tebSettings = wr.getSettings();
        tebSettings.setJavaScriptEnabled(true);
        wr.loadUrl("file:///android_asset/location2.html");

    }
}