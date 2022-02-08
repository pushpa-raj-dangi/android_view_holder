package com.example.recyclervieweample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    private String[] names  = {"Ram","Shyam","Gita","Sita","Binita","Bishow","Ramita","Sushil","Suhana","Suraj","Sujita","Shankar","Ishwor","Madav","Pushpa","Sher","Deuba","6","1","2","3","4","5","6","1","2","3","4","5","6","1","2","3","4","5","6","1","2","3","4","5","6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new CustomAdapter(this,names));
    }
}