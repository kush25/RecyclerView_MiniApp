package com.hcl.recyclerview_miniapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item,parent,false);
            return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ListItem list = listItems.get(position);
        holder.textHead.setText(list.getHeading());
        holder.textdescrip.setText(list.getDescrip());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textHead;
        public TextView textdescrip;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = (TextView) itemView.findViewById(R.id.heading);
            textdescrip = (TextView) itemView.findViewById(R.id.descrip);
        }


    }

}


// onCreateViewHolder will be called when instance of class ViewHolder is created.

//Here we are going through generating basic methods required for RecyclerView.