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

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FViewHolder> {


    ArrayList<FHelperClass> classF;

    public FeaturedAdapter(ArrayList<FHelperClass> classF) {
        this.classF = classF;
    }

    @NonNull
    @Override
    public FViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_card_design,parent,false);
        FViewHolder fViewHolder = new FViewHolder(v);


        return fViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FViewHolder holder, int position) {
        FHelperClass fHelperClass = classF.get(position);

        holder.image.setImageResource(fHelperClass.getImage());
        holder.title.setText(fHelperClass.getTitle());
    }

    @Override
    public int getItemCount() {
        return classF.size();
    }


    public static class FViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;

        public FViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imgFeatured);
            title = itemView.findViewById(R.id.tvTitle);
        }
    }
}
