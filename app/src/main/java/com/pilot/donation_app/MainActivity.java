 package com.pilot.donation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

 public class MainActivity extends AppCompatActivity {

    private WebView webView; // 웹뷰
    private WebSettings webViewSetting; // 웹뷰 셋팅
    private String webUrlLocal = "https://www.naver.com"; // 네이버 url

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.testWebview); // 웹뷰 id
        webViewSetting = webView.getSettings();             // testWebview를 webViewSetting 에 선언 해준다.

        webViewSetting.setJavaScriptEnabled(true);    // 웹의 자바스크립트 허용
        webViewSetting.setLoadWithOverviewMode(true); // 웹 화면을 디바이스 화면에 맞게 셋팅
        webView.setWebViewClient(new WebViewClient(){}); // 내부 webview로 열기

        webView.loadUrl(webUrlLocal);  // Load할 url 주소(저희는 테스트로 네이버를 띄울 겁니다.)
    }
}
