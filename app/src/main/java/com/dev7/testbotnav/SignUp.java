package com.dev7.testbotnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    CardView jkLklk, jkPrmpn;
    private TextView masuk;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Daftar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        masuk = (TextView)findViewById(R.id.masuk);
        jkLklk = (CardView) findViewById(R.id.jkLklk);
        jkPrmpn = (CardView) findViewById(R.id.jkPrmpn);
        btnDaftar = (Button) findViewById(R.id.btnDaftar);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SignUp.this, SignIn.class));

            }
        });

        jkLklk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Laki-Laki", Toast.LENGTH_SHORT).show();
            }
        });

        jkPrmpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Perempuan", Toast.LENGTH_SHORT).show();
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda sudah Terdaftar", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }

        });

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
