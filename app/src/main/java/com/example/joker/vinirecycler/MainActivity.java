package com.example.joker.vinirecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    List<String> name;
    List<String> desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //2
        name = new ArrayList<>();
        desc = new ArrayList<>();

        setUpData();

        //3 list item

        //4 create Adapter

        MyAdapter adapter = new MyAdapter(this,name,desc);

        recyclerView.setAdapter(adapter);



    }

    private void setUpData() {

        name.add("Vinita");
        name.add("Shriom");
        name.add("Raju");
        name.add("Sunil");
        name.add("Deepak");

        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");

        name.add("Vinita");
        name.add("Shriom");
        name.add("Raju");
        name.add("Sunil");
        name.add("Deepak");

        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");name.add("Vinita");
        name.add("Shriom");
        name.add("Raju");
        name.add("Sunil");
        name.add("Deepak");

        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");name.add("Vinita");
        name.add("Shriom");
        name.add("Raju");
        name.add("Sunil");
        name.add("Deepak");

        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");
        desc.add("Android Developer");

    }
}
