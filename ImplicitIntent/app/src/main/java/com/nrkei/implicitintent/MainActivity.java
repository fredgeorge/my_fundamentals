package com.nrkei.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWeb(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);
    }

    public void openCall(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9192722741"));
        startActivity(i);
    }

    public void openMap(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 20.5, 78.96"));
        startActivity(i);
    }
}
