package com.haha.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }
    public void InitView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<DataHero> arrayList = new ArrayList<>();
        arrayList.add(new DataHero(R.drawable.hero1,"Hero 1"));
        arrayList.add(new DataHero(R.drawable.hero2,"Hero 2"));
        arrayList.add(new DataHero(R.drawable.hero3,"Hero 3"));
        arrayList.add(new DataHero(R.drawable.hero4,"Hero 4"));
        arrayList.add(new DataHero(R.drawable.hero5,"Hero 5"));
        arrayList.add(new DataHero(R.drawable.hero6,"Hero 6"));
        arrayList.add(new DataHero(R.drawable.hero6,"Hero 7"));
        arrayList.add(new DataHero(R.drawable.hero8,"Hero 8"));
        AdapterHero shopAdapter = new AdapterHero(arrayList,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);

    }
}
