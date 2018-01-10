package com.haha.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.haha.recyclerview.R.id.txtNameHero;

/**
 * Created by trant on 03/01/2018.
 */

public class AdapterHero extends RecyclerView.Adapter<AdapterHero.ViewHolder>{
    private ArrayList<DataHero> mDataHeros;
    private  Context context;

    public AdapterHero(ArrayList<DataHero> dataHeros, Context context) {
        this.mDataHeros = dataHeros;
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
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        return mDataHeros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTxtNameHero;
        ImageView mImageHero;
        public ViewHolder(View itemView) {
            super(itemView);
            mTxtNameHero =(TextView) itemView.findViewById(txtNameHero);
            mImageHero = (ImageView) itemView.findViewById(R.id.imgHero);
        }
        public void setData(int pos){
            mTxtNameHero.setText(mDataHeros.get(pos).getName());
            mImageHero.setImageResource(mDataHeros.get(pos).getImage());
        }
    }
}
