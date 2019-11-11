package com.dev7.testbotnav.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev7.testbotnav.R;
import com.dev7.testbotnav.tabhost.Pembelian;
import com.dev7.testbotnav.tabhost.Tagihan;

//import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class TransaksiFragment extends Fragment {

    private FragmentTabHost mtabhost;


    public TransaksiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transaksi, container, false);

//        mtabhost = (FragmentTabHost)view.findViewById(android.R.id.tabhost);

        mtabhost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
        mtabhost.setup(getActivity(), getChildFragmentManager(),android.R.id.tabcontent);
//        mtabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        mtabhost.addTab(mtabhost.newTabSpec("tagihan").setIndicator("Tagihan",null), Tagihan.class,null);
        mtabhost.addTab(mtabhost.newTabSpec("pembelian").setIndicator("Pembelian",null), Pembelian.class,null);

       return view;
    }

}
