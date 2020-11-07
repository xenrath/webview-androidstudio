package com.xenrath.mywebview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webviewku;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewku = (WebView)findViewById(R.id.WebView);
        websettingku = webviewku.getSettings();
        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://github.com/xenrath/webview-androidstudio");
    }
}