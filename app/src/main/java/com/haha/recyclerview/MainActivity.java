package com.haha.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataHero> mDataHeros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        initView(mRecyclerView);
        addHero(mRecyclerView);
    }
    private void initView(RecyclerView recyclerView){
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
    private  void addHero(RecyclerView recyclerView){
        mDataHeros = new ArrayList<>();
        mDataHeros.add(new DataHero(R.drawable.hero1,"Hero 1"));
        mDataHeros.add(new DataHero(R.drawable.hero2,"Hero 2"));
        mDataHeros.add(new DataHero(R.drawable.hero3,"Hero 3"));
        mDataHeros.add(new DataHero(R.drawable.hero4,"Hero 4"));
        mDataHeros.add(new DataHero(R.drawable.hero5,"Hero 5"));
        mDataHeros.add(new DataHero(R.drawable.hero6,"Hero 6"));
        mDataHeros.add(new DataHero(R.drawable.hero6,"Hero 7"));
        mDataHeros.add(new DataHero(R.drawable.hero8,"Hero 8"));
        AdapterHero mAdapterHero = new AdapterHero(mDataHeros,getApplicationContext());
        recyclerView.setAdapter(mAdapterHero);

    }
}
