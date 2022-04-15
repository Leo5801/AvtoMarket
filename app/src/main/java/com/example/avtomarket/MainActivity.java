package com.example.avtomarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> namearraylist;
    ArrayList<Integer> imagearraylist;
    Odi odi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview1);
        namearraylist = new ArrayList<>();
        imagearraylist = new ArrayList<>();

        namearraylist.add("Mercedec");
        namearraylist.add("BMW");
        namearraylist.add("AirPlane");
        namearraylist.add("Cat");

        imagearraylist.add(R.drawable.mercedes);
        imagearraylist.add(R.drawable.bmw);
        imagearraylist.add(R.drawable.air1);
        imagearraylist.add(R.drawable.cat1);

        odi = new Odi(MainActivity.this,namearraylist,imagearraylist);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        recyclerView.setAdapter(odi);

    }
}