package com.dev7.testbotnav.fragment;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.dev7.testbotnav.DetailActivity;
import com.dev7.testbotnav.R;

import java.util.ArrayList;
import java.util.HashMap;


//import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritFragment extends Fragment {

    GridView gridFavorit;
    SimpleAdapter simpleAdapter;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    public FavoritFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorit, container, false);

        gridFavorit = (GridView) view.findViewById(R.id.gridFavorit);

        setProduct();

        return view;
    }

    private void setProduct(){

        for (int i= 1; i<=2; i++){
            HashMap<String, String> map = new HashMap<>();
            map.put("price", String.valueOf("Rp."+i) + ".000");
//            map.put("barang", getId(pro))
            arrayList.add(map);
        }

        simpleAdapter = new SimpleAdapter(getActivity(), arrayList, R.layout.adapter_favorit,
                new String[] {"price"},
                new int[] {R.id.txtHarga});
        gridFavorit.setAdapter(simpleAdapter);
        gridFavorit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String harga = ((TextView)view.findViewById(R.id.txtHarga)).getText().toString();
                Toast.makeText(getActivity(), harga, Toast.LENGTH_LONG).show();

                //pindah halaman/activity (rumus menggunakan intent terus get activity terus tujuan (activity apa))
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }
        });
    }

}
