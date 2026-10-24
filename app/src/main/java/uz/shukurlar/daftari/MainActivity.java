package uz.shukurlar.daftari;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        getWindow().setStatusBarColor(Color.parseColor("#0f6b57"));
        getWindow().setNavigationBarColor(Color.parseColor("#0c1f1c"));
        web = new WebView(this);
        web.setBackgroundColor(Color.parseColor("#0c1f1c"));
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setAllowFileAccess(true);
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
}
