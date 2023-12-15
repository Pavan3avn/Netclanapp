package com.pavan.netclan.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pavan.netclan.R;
import com.pavan.netclan.addon;
import com.pavan.netclan.listadapter;
import com.pavan.netclan.personalmodel;

import java.util.ArrayList;
import java.util.List;


public class personal extends Fragment {

    RecyclerView recyclerView;
    listadapter listadapter;

    FloatingActionButton fab;
    public personal() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fab = view.findViewById(R.id.fabbtn);
        recyclerView   = view.findViewById(R.id.recylerview);
        listadapter = new listadapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listadapter);
        List<personalmodel> list = samplelist();
        listadapter.submitList(list);

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(personal.class, addon.class);
//                startActivity(intent);
//            }
//        });
//
  }

    private List<personalmodel> samplelist() {
        List<personalmodel> list = new ArrayList<>();
        list.add(new personalmodel("Bhavana","vadodara","student","within 200-300m","coffee","Business","Freindship","Hi community! i am open to new connections "));
        list.add(new personalmodel("Yug patel","vadodara","student","within 200-300m","coffee","Business","Freindship","Hi community! i am open to new connections "));
        list.add(new personalmodel("Sonu Prajapathi","vadodara","student","within 200-300m","coffee","Business","Freindship","Hi community! i am open to new connections "));
        list.add(new personalmodel("Krishna kumar","vadodara","student","within 200-300m","coffee","Business","Freindship","Hi community! i am open to new connections "));
        return list;
    }
}