package com.haha.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by trant on 03/01/2018.
 */

public class AdapterHero extends RecyclerView.Adapter<AdapterHero.ViewHolder>{
    ArrayList<DataHero> dataHeros;
    Context context;

    public AdapterHero(ArrayList<DataHero> dataHeros, Context context) {
        this.dataHeros = dataHeros;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_grow,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.txtNameHero.setText(dataHeros.get(position).getName());
        holder.imageHero.setImageResource(dataHeros.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataHeros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNameHero;
        ImageView imageHero;

        public ViewHolder(View itemView) {
            super(itemView);
            txtNameHero =(TextView) itemView.findViewById(R.id.txtNameHero);
            imageHero = (ImageView) itemView.findViewById(R.id.imgHero);
        }
    }
}
