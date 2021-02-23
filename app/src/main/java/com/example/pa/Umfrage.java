package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Umfrage extends AppCompatActivity {

    WebView wr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umfrage);

        wr = findViewById(R.id.wr);

        wr.setWebViewClient(new WebViewClient());
        WebSettings tebSettings = wr.getSettings();
        tebSettings.setJavaScriptEnabled(true);
        wr.loadUrl("https://helalloov.estbyani.com/survey/#/channel/212B7029");
    }
}