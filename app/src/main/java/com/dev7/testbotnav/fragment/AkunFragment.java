package com.dev7.testbotnav.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dev7.testbotnav.Edit;
import com.dev7.testbotnav.Lihat;
import com.dev7.testbotnav.R;
import com.dev7.testbotnav.SignIn;

//import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AkunFragment extends Fragment {
    private TextView profil, exitapp;

    public AkunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_akun, container, false);

        profil = (TextView)view.findViewById(R.id.profil);

      //  exitapp = (TextView)view.findViewById(R.id.exitapp);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Lihat.class);
                startActivity(intent);
            }
        });

        /*exitapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SignIn.class);
                startActivity(intent);
            }
        });*/

        return view;
    }

}
