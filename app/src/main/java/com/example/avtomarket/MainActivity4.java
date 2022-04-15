package com.example.avtomarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    WebView webView;

    ArrayList<CarModel> carModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        webView = findViewById(R.id.webview1);

        webView.loadUrl("https://olcha.uz");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        carModelArrayList = new ArrayList<>();

        carModelArrayList.add(new CarModel("MercedecG63",R.drawable.mercedes));

    }
}