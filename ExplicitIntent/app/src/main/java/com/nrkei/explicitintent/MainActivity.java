package com.nrkei.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static final String MESSAGE = "com.nrkei.explicitintent.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNext(View view) {
        Intent i = new Intent(this, Second.class);
        EditText e = findViewById(R.id.input);
        i.putExtra(MESSAGE, e.getText().toString());
        startActivity(i);
    }
}
