package com.haha.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataHero> dataHeros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        initView(recyclerView);
        addHero(recyclerView);
    }
    private void initView(RecyclerView recyclerView){
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
    private  void addHero(RecyclerView recyclerView){
        dataHeros = new ArrayList<>();
        dataHeros.add(new DataHero(R.drawable.hero1,"Hero 1"));
        dataHeros.add(new DataHero(R.drawable.hero2,"Hero 2"));
        dataHeros.add(new DataHero(R.drawable.hero3,"Hero 3"));
        dataHeros.add(new DataHero(R.drawable.hero4,"Hero 4"));
        dataHeros.add(new DataHero(R.drawable.hero5,"Hero 5"));
        dataHeros.add(new DataHero(R.drawable.hero6,"Hero 6"));
        dataHeros.add(new DataHero(R.drawable.hero6,"Hero 7"));
        dataHeros.add(new DataHero(R.drawable.hero8,"Hero 8"));
        AdapterHero shopAdapter = new AdapterHero(dataHeros,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);

    }
}
