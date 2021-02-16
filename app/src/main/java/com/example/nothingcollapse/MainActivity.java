package com.example.nothingcollapse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("collapse example");
        setSupportActionBar(toolbar);

//        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
//        toolbar.title = "HELLO EXAMPLE"
//        setSupportActionBar(toolbar)
//        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(false) //툴바에 백키(<-) 보이게할거면 이거 사용
    }
}