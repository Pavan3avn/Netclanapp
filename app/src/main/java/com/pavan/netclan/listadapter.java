package com.pavan.netclan;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class listadapter extends ListAdapter<personalmodel,listadapter.viewholder> {

    public listadapter(){
        super(new ItemDiffCallback());

    }

    @NonNull
    @Override
    public listadapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listadapter.viewholder holder, int position) {
        personalmodel personalmodel = getItem(position);
        holder.name.setText(personalmodel.getName());
        holder.distance.setText(personalmodel.getDistance());
        holder.city.setText(personalmodel.getLocation());
        holder.p1.setText(personalmodel.getP1());
        holder.p2.setText(personalmodel.getP2());
        holder.p3.setText(personalmodel.getP3());
        holder.descrip.setText(personalmodel.getDescription());
        holder.role.setText(personalmodel.getRole());


    }

    public class viewholder extends RecyclerView.ViewHolder{

        TextView name,city,role,distance,p1,p2,p3,descrip;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            name  = itemView.findViewById(R.id.name);
            city = itemView.findViewById(R.id.city);
            role = itemView.findViewById(R.id.role);
            distance = itemView.findViewById(R.id.distance);
            p1 = itemView.findViewById(R.id.p1);
            p2 = itemView.findViewById(R.id.p2);
            p3 = itemView.findViewById(R.id.p3);
            descrip = itemView.findViewById(R.id.des);
        }
    } {
    }

    public static class ItemDiffCallback extends DiffUtil.ItemCallback<personalmodel> {
        @Override
        public boolean areItemsTheSame(@NonNull personalmodel oldItem, @NonNull personalmodel newItem) {
            return oldItem.getName().equals(newItem.getName());
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull personalmodel oldItem, @NonNull personalmodel newItem) {
            return oldItem.equals(newItem);
        }
    }
}
