package com.dev7.testbotnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dev7.testbotnav.Detail.Detail_bayam;
import com.dev7.testbotnav.Detail.Detail_dewa;
import com.dev7.testbotnav.Detail.Detail_kelor;
import com.dev7.testbotnav.Detail.Detail_miana;

public class Apotik extends AppCompatActivity {

    TextView bayam, dewa, kelor, miana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotik);

        bayam = (TextView)findViewById(R.id.bayam);
        dewa = (TextView)findViewById(R.id.dewa);
        kelor = (TextView)findViewById(R.id.kelor);
        miana = (TextView)findViewById(R.id.miana);


        bayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Apotik.this, Detail_bayam.class));
            }
        });

        dewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Apotik.this, Detail_dewa.class));
            }
        });

        kelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Apotik.this, Detail_kelor.class));
            }
        });

        miana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Apotik.this, Detail_miana.class));
            }
        });

        getSupportActionBar().setTitle("Apotik");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
