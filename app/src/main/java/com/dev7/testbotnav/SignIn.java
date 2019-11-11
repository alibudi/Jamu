package com.dev7.testbotnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    private TextView txtSignUP;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("Masuk");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtSignUP = (TextView) findViewById(R.id.txtSignUP);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        txtSignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this, SignUp.class));
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Anda Telah Masuk", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignIn.this, MainActivity.class));
            }
        });

//        new  Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//
//                Intent i=new Intent(SignIn.this,MainActivity.class);
//                startActivity(i);
//            }
//        }, 7000);
    };


    @Override
    public boolean onSupportNavigateUp () {
        finish();
        return true;
    }
}
