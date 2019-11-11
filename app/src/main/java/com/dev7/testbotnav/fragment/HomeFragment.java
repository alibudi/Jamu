package com.dev7.testbotnav.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.dev7.testbotnav.About;
import com.dev7.testbotnav.Apotik;
import com.dev7.testbotnav.Catalog;
import com.dev7.testbotnav.DetailActivity;
import com.dev7.testbotnav.Panduan;
import com.dev7.testbotnav.R;

//import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

   private TextView catalog, apotik, panduan, tentang;
    SimpleAdapter simpleAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        catalog = (TextView)view.findViewById(R.id.catalog);
        panduan = (TextView)view.findViewById(R.id.panduan);
        apotik = (TextView)view.findViewById(R.id.apotik);
        tentang = (TextView)view.findViewById(R.id.tentang);

        catalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Catalog.class);
                startActivity(intent);
            }
        });

        panduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Panduan.class);
                startActivity(intent);
            }
        });

        apotik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Apotik.class);
                startActivity(intent);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), About.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
