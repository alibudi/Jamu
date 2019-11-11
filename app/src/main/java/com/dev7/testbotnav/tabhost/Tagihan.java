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

import com.dev7.testbotnav.Apotik;
import com.dev7.testbotnav.R;
import com.dev7.testbotnav.StatusActivity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tagihan extends Fragment {

    private ListView listTagihan;
    SimpleAdapter simpleAdapter;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();



    public Tagihan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tagihan, container, false);

        listTagihan = (ListView) view.findViewById(R.id.listTagihan);

        setPembelian();

        return view;
    }

    private void setPembelian(){

        for (int i= 1; i<=2; i++){
            HashMap<String, String> map = new HashMap<>();
            map.put("Nama Barang", "Nama Barang - " + String.valueOf(i));
            arrayList.add(map);
        }

        simpleAdapter = new SimpleAdapter(getActivity(), arrayList, R.layout.adapter_tagihan,
                new String[] {"Nama Barang"},
                new int[] {R.id.txtNamaBarang });
        listTagihan.setAdapter(simpleAdapter);
        listTagihan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), StatusActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }
}
