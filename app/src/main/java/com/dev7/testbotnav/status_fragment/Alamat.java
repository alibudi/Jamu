package com.dev7.testbotnav.status_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev7.testbotnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Alamat extends Fragment {


    public Alamat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alamat, container, false);
        return view;
    }

}
