package com.example.milos.androidtest;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView artist;
        TextView album;
        TextView genre;
        TextView year;
        TextView rate;
        TextView have;
        TextView users;
        ImageView image;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.artist = (TextView) itemView.findViewById(R.id.artist);
            this.album = (TextView) itemView.findViewById(R.id.album);
            this.genre = (TextView) itemView.findViewById(R.id.genre);
            this.year = (TextView) itemView.findViewById(R.id.year);
            this.rate = (TextView) itemView.findViewById(R.id.rate);
            this.have = (TextView) itemView.findViewById(R.id.have);
            this.users = (TextView) itemView.findViewById(R.id.users);
            this.image = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);



        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView artist = holder.artist;
        TextView album = holder.album;
        TextView genre = holder.genre;
        TextView year = holder.year;
        TextView rate = holder.rate;
        TextView have = holder.have;
        TextView users = holder.users;
        ImageView image = holder.image;




        artist.setText(dataSet.get(listPosition).getArtist());
        album.setText(dataSet.get(listPosition).getAlbum());
        genre.setText(dataSet.get(listPosition).getGenre());
        year.setText(dataSet.get(listPosition).getYear());
        rate.setText(dataSet.get(listPosition).getRate());
        have.setText(dataSet.get(listPosition).getHave());
        users.setText(dataSet.get(listPosition).getUsers());
        //image.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}