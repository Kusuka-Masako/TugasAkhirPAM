package com.example.apktopupgeming;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import adapter.RecycleViewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    ArrayList<Produck> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i < Myitem.Headline.length; i++) {
            data.add(new Produck(
                    Myitem.Headline[i],
                    Myitem.Subhead[i],
                    Myitem.SubheadB[i],
                    Myitem.SubheadC[i],
                    Myitem.iconList[i]
            ));
        }

        recyclerViewAdapter = new RecycleViewAdapter(data);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}