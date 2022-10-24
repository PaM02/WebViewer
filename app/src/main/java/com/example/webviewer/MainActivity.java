package com.example.webviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        webView.loadUrl("http://www.linkonsolutions.com/");


    }
}
