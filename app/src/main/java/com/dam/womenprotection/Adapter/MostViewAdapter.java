package com.dam.womenprotection.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.womenprotection.R;

import java.util.ArrayList;

public class MostViewAdapter extends RecyclerView.Adapter<MostViewAdapter.MVViewHolder> {


    ArrayList<MVHelperClass> mvHelperClasses;

    public MostViewAdapter(ArrayList<MVHelperClass> classF) {
        this.mvHelperClasses = classF;
    }

    @NonNull
    @Override
    public MVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_view_card_design,parent,false);
        MVViewHolder fViewHolder = new MVViewHolder(v);


        return fViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MVViewHolder holder, int position) {
        MVHelperClass mHelperClass = mvHelperClasses.get(position);

        holder.image.setImageResource(mHelperClass.getImage());
        holder.title.setText(mHelperClass.getTitle());
        holder.descrip.setText(mHelperClass.getDescrip());
    }

    @Override
    public int getItemCount() {
        return mvHelperClasses.size();
    }


    public static class MVViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        TextView descrip;

        public MVViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imgCardMV);
            title = itemView.findViewById(R.id.tvTitleMV);
            descrip = itemView.findViewById(R.id.tvDescripMV);
        }
    }
}
