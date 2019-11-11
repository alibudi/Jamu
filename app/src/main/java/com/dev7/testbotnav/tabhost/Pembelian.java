package com.dev7.testbotnav.tabhost;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.dev7.testbotnav.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pembelian extends Fragment {

    ListView listPembelian;
    SimpleAdapter simpleAdapter;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();


    public Pembelian() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pembelian, container, false);

        listPembelian = (ListView) view.findViewById(R.id.listPembelian);

        setPembelian();

        return view;
    }

    private void setPembelian(){

        for (int i= 1; i<=2; i++){
            HashMap<String, String> map = new HashMap<>();
            map.put("Nama Barang", "Nama Barang - " + String.valueOf(i));
            arrayList.add(map);
        }

        simpleAdapter = new SimpleAdapter(getActivity(), arrayList, R.layout.adapter_pembelian,
                new String[] {"Nama Barang"},
                new int[] {R.id.txtNamaBarang });
        listPembelian.setAdapter(simpleAdapter);
        listPembelian.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Pembelian = ((TextView)view.findViewById(R.id.txtNamaBarang)).getText().toString();
                Toast.makeText(getActivity(), Pembelian, Toast.LENGTH_SHORT).show();
//
////                kie nggo pindah aring sliding tab, tab beranda kue 0 nek
////                tab merek kui 1 begitu seterusnya
//
//                MainActivity.tabLayout.setupWithViewPager(MainActivity.viewPager);
//                MainActivity.viewPager.setCurrentItem(0);

//                startActivity(new Intent(getActivity(), StatusActivity.class));
            }
        });
    }

}
