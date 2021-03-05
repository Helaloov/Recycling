package com.example.pa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Quiz extends AppCompatActivity {

    WebView wr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        wr = findViewById(R.id.wr);

        wr.setWebViewClient(new WebViewClient());
        WebSettings tebSettings = wr.getSettings();
        tebSettings.setJavaScriptEnabled(true);
        wr.loadUrl("https://app.involve.me/hkugukkv/test-your-history-know-how-943f");
    }
}