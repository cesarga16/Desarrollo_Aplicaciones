package com.example.actividad_8;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListViewAdaptor extends RecyclerView.Adapter<ListViewAdaptor.MyViewHolder> {
    private List<Data> mDataList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name,price;
        public ImageView imageView;

        public MyViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            price= (TextView) view.findViewById(R.id.price);
            imageView = (ImageView) view.findViewById(R.id.image);

        }

    }



    public ListViewAdaptor(List<Data> dataList){
        this.mDataList = dataList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = mDataList.get(position);
        holder.name.setText(data.getName());
        holder.price.setText(data.getPrice());
        holder.imageView.setImageResource(data.getImageId());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }



}