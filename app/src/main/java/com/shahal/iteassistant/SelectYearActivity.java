package com.shahal.iteassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_year);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("");
    }
}
