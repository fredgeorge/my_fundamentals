package com.nrkei.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t = findViewById(R.id.result);
        t.setText(getIntent().getStringExtra(MainActivity.MESSAGE));
    }
}
