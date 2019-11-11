package com.dev7.testbotnav.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev7.testbotnav.R;
import com.dev7.testbotnav.adapter.CartAdapter;
import com.dev7.testbotnav.model.CartModel;

import java.util.ArrayList;

//import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class KeranjangFragment extends Fragment {

    SwipeRefreshLayout swipe;
    RecyclerView recyclerView;
    ArrayList<CartModel> carts;
    CartAdapter cartAdapter;


    public KeranjangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_keranjang, container, false);

        swipe = (SwipeRefreshLayout) view.findViewById(R.id.swipe);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        carts = new ArrayList<>();

        setCart();

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                carts.clear();
                recyclerView.setAdapter(null);
                setCart();
            }
        });

        return view;
    }

    private void setCart() {
        for (int i = 0; i < 3; i++) {
            CartModel model = new CartModel();
            carts.add(model);
        }

        cartAdapter = new CartAdapter(KeranjangFragment.this.getActivity(), carts);
        cartAdapter.notifyDataSetChanged();
        Log.d("_COUNT", String.valueOf(cartAdapter.getItemCount()) );
        recyclerView.setAdapter(cartAdapter);

        swipe.setRefreshing(false);

    }
}
