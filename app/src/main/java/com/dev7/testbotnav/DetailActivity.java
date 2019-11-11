package com.dev7.testbotnav;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dev7.testbotnav.fragment.KeranjangFragment;

public class DetailActivity extends AppCompatActivity {

    private ImageView img_view;
    private TextView txtLihat, txtBeli;
    private Dialog dialog;

    private void checkOut(){
        dialog = new Dialog(DetailActivity.this);
        dialog.setContentView(R.layout.dialog_add_keranjang);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        dialog.show();

        Button btnBayar = (Button) dialog.findViewById(R.id.btnbayar);
        TextView TambahBrg = (TextView) dialog.findViewById(R.id.TambahBrg);
        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Fragment fragment = null;
                dialog.dismiss();
//                startActivity(new Intent(DetailActivity.this, KeranjangFragment.class));
//                Intent intent = new Intent(DetailActivity.this, KeranjangFragment.class);
//                startActivity(intent);
//                Fragment fragment = new KeranjangFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.keranjang, fragment);
//                transaction.commit();

    }
        });

        TambahBrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img_view = (ImageView) findViewById(R.id.imagescroll);

        txtLihat = (TextView)findViewById(R.id.txtLihat);
        txtBeli = (TextView)findViewById(R.id.txtBeli);

        txtBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOut();
            }
        });

        txtLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Produk Lainnya", Toast.LENGTH_LONG).show();

            }
        });


    }
}
