package com.dev7.testbotnav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lihat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat);

        getSupportActionBar().setTitle("Profil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
