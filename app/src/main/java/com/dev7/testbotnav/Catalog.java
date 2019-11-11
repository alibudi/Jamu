package com.dev7.testbotnav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalog extends AppCompatActivity {

    GridView gridKatalog;
    SimpleAdapter simpleAdapter;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        getSupportActionBar().setTitle("Katalog");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gridKatalog = (GridView) findViewById(R.id.gridKatalog);

        setProduct();

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void setProduct(){

        for (int i= 1; i<=10; i++){
            HashMap<String, String> map = new HashMap<>();
            map.put("price", String.valueOf("Rp."+i) + ".000");
//            map.put("barang", getId(pro))
            arrayList.add(map);
        }

        simpleAdapter = new SimpleAdapter(Catalog.this, arrayList, R.layout.adapter_favorit,
                new String[] {"price"},
                new int[] {R.id.txtHarga});
        gridKatalog.setAdapter(simpleAdapter);
        gridKatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String harga = ((TextView)view.findViewById(R.id.txtHarga)).getText().toString();
//                Toast.makeText(getActivity(), harga, Toast.LENGTH_LONG).show();

                //pindah halaman/activity (rumus menggunakan intent terus get activity terus tujuan (activity apa))
                startActivity(new Intent(Catalog.this, DetailActivity.class));
            }
        });
    }
}
