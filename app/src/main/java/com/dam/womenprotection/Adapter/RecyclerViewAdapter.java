package com.dam.womenprotection.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.womenprotection.Javabeans.Item;
import com.dam.womenprotection.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<com.dam.womenprotection.Adapter.RecyclerViewAdapter.ItemViewHolder>
        implements View.OnClickListener{

    private ArrayList<Item> datos;
    private View.OnClickListener listener;

    public RecyclerViewAdapter(ArrayList<Item> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_blog,parent,false);
        ItemViewHolder ivh = new ItemViewHolder(v);
        v.setOnClickListener(this);
        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bindItem(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onClick(View v) {
        if (listener != null){
            listener.onClick(v);
        }
    }

    public void setListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public  static  class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView titulo;
        private TextView avance;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imageView);
            titulo = itemView.findViewById(R.id.tvTitulo);
            avance = itemView.findViewById(R.id.tvAvance);

        }

        public void bindItem(Item item){
            imagen.setImageResource(item.getIdImagen());
            titulo.setText(item.getTitulo());
            avance.setText(item.getAvance());

        }
    }
}
