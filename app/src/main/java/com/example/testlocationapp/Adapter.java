package com.example.testlocationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Model> cityNames;
    Context context;

    public Adapter(Context context, ArrayList<Model> cityNames) {
        this.cityNames = cityNames;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.division.setText(cityNames.get(position).getDivision());
        holder.city.setText(cityNames.get(position).getCity());
    }

    @Override
    public int getItemCount() {
        return cityNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView division,city;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            division = (TextView)itemView.findViewById(R.id.division_text);
            city = (TextView)itemView.findViewById(R.id.city_text);
        }
    }
}
