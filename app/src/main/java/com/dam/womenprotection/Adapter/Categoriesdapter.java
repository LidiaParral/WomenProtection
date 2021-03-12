package com.dam.womenprotection.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.womenprotection.R;

import java.util.ArrayList;

public class Categoriesdapter extends RecyclerView.Adapter<Categoriesdapter.CViewHolder> {


    ArrayList<CHelperClass> cHelperClasses;

    public Categoriesdapter(ArrayList<CHelperClass> classF) {
        this.cHelperClasses = classF;
    }

    @NonNull
    @Override
    public CViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card_design,parent,false);
        CViewHolder catViewHolder = new CViewHolder(v);


        return catViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CViewHolder holder, int position) {
        CHelperClass catHelperClass = cHelperClasses.get(position);


        holder.title.setText(catHelperClass.getTitle());
        holder.image.setImageResource(catHelperClass.getImage());
    }

    @Override
    public int getItemCount() {
        return cHelperClasses.size();
    }


    public static class CViewHolder extends RecyclerView.ViewHolder{


        TextView title;
        ImageView image;

        public CViewHolder(@NonNull View itemView) {
            super(itemView);


            title = itemView.findViewById(R.id.tvTitleC);
            image = itemView.findViewById(R.id.imgCardC);
        }
    }
}
