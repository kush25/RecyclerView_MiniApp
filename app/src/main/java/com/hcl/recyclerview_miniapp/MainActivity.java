package com.hcl.recyclerview_miniapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    private RecyclerView.Adapter adptr;

    public List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = (RecyclerView) findViewById(R.id.recycleView);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for(int i = 0;i<=15;i++){
            ListItem list = new ListItem(
                    "Header" + (i+1) ,"Description"
            );

            listItems.add(list);
        }

        adptr = new MyAdapter(listItems,this);
        recycleView.setAdapter(adptr);


    }
}

