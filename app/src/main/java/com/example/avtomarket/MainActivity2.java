package com.example.avtomarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<String> bmwnamearraylist;
    ArrayList<Integer> bmwimagearraylist;
    ArrayList<String> mercedesnamearraylist;
    ArrayList<Integer> mercedesimagearraylist;
    ArrayList<String> airnamearraylist;
    ArrayList<Integer> airimagearraylist;
    ArrayList<String> catnamearraylist;
    ArrayList<Integer> catimagearraylist;
    RecyclerView recyclerView;
    Odi2 odi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recyclerview2);


        bmwnamearraylist = new ArrayList<>();
        bmwimagearraylist = new ArrayList<>();
        mercedesnamearraylist = new ArrayList<>();
        mercedesimagearraylist = new ArrayList<>();
        airnamearraylist = new ArrayList<>();
        airimagearraylist = new ArrayList<>();
        catnamearraylist = new ArrayList<>();
        catimagearraylist = new ArrayList<>();


        bmwnamearraylist.add("BMW X5");
        bmwnamearraylist.add("BMW X6");
        bmwnamearraylist.add("BMW X7");
        bmwimagearraylist.add(R.drawable.bmw);
        bmwimagearraylist.add(R.drawable.bmw2);
        bmwimagearraylist.add(R.drawable.bmw3);

        mercedesnamearraylist.add("MerCedecG63");
        mercedesnamearraylist.add("MerCedecG64");
        mercedesnamearraylist.add("MerCedecG65");

        mercedesimagearraylist.add(R.drawable.mercedes);
        mercedesimagearraylist.add(R.drawable.mercedes2);
        mercedesimagearraylist.add(R.drawable.mercedes3);

        airnamearraylist.add("AirSu34");
        airnamearraylist.add("AirSu35");
        airnamearraylist.add("AirSu36");

        airimagearraylist.add(R.drawable.air1);
        airimagearraylist.add(R.drawable.air2);
        airimagearraylist.add(R.drawable.air3);

        catnamearraylist.add("Cat1");
        catnamearraylist.add("Cat2");
        catnamearraylist.add("Cat3");

        catimagearraylist.add(R.drawable.cat1);
        catimagearraylist.add(R.drawable.cat2);
        catimagearraylist.add(R.drawable.cat3);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

//        if (name.equals("Mercedec")) {
//            odi2 = new Odi2(MainActivity2.this,mercedesnamearraylist,mercedesimagearraylist);
//        }
//
//        if (name.equals("BMW")) {
//            odi2 = new Odi2(MainActivity2.this,bmwnamearraylist,bmwimagearraylist);
//        }
//
//        if (name.equals("AirPlane")) {
//            odi2 = new Odi2(MainActivity2.this,airnamearraylist,airimagearraylist);
//        }
//
//        if (name.equals("Cat")) {
//            odi2 = new Odi2(MainActivity2.this,catnamearraylist,catimagearraylist);
//        }

        switch (name){
            case "Mercedec":
                odi2 = new Odi2(MainActivity2.this,mercedesnamearraylist,mercedesimagearraylist);
                break;

            case "BMW":
                odi2 = new Odi2(MainActivity2.this,bmwnamearraylist,bmwimagearraylist);
                break;

            case "AirPlane":
                odi2 = new Odi2(MainActivity2.this,airnamearraylist,airimagearraylist);
                break;

            case "Cat":
                odi2 = new Odi2(MainActivity2.this,catnamearraylist,catimagearraylist);
                break;
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity2.this));
        recyclerView.setAdapter(odi2);
    }
}