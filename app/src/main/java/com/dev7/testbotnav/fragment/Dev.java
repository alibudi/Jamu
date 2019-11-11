package com.dev7.testbotnav.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev7.testbotnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dev extends Fragment {


    public Dev() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dev, container, false);
        return view;
    }

}
