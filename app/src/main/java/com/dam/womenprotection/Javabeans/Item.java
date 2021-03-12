package com.dam.womenprotection.Javabeans;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    private  int idImagen;
    private String titulo;
    private String decription;
    private String avance;

    public Item(int idImagen, String titulo, String decription, String avance) {
        this.idImagen = idImagen;
        this.titulo = titulo;
        this.decription = decription;
        this.avance = avance;
    }

    protected Item(Parcel in) {
        idImagen = in.readInt();
        titulo = in.readString();
        decription = in.readString();
        avance = in.readString();
    }


    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public com.dam.womenprotection.Javabeans.Item createFromParcel(Parcel in) {
            return new com.dam.womenprotection.Javabeans.Item(in);
        }

        @Override
        public com.dam.womenprotection.Javabeans.Item[] newArray(int size) {
            return new com.dam.womenprotection.Javabeans.Item[size];
        }
    };

    public int getIdImagen() {
        return idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDecription() {
        return decription;
    }

    public String getAvance() { return avance; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idImagen);
        dest.writeString(titulo);
        dest.writeString(decription);
        dest.writeString(avance);
    }
}
