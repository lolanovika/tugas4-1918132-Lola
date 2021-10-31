package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private mahasiswaadapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new mahasiswaadapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Customer 1", "Serum Brightrning",
                "Rp 25.000",R.drawable.ic_1));
        mahasiswaArrayList.add(new mahasiswa("Customer 2", "Body Wash",
                "Rp 35.000",R.drawable.ic_2));
        mahasiswaArrayList.add(new mahasiswa("Customer 3", "Smoothing Shampoo",
                "Rp 30.000",R.drawable.ic_3));
    }
}