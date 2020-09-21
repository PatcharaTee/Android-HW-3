package com.example.quizgame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private DriverList[] driverLists;

    public MyAdapter(DriverList[] driverLists) {
        this.driverLists = driverLists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgV.setImageResource(driverLists[position].getImgId());
        holder.driverName.setText(driverLists[position].getDriverName());
        holder.team.setText(driverLists[position].getTeam());
    }

    @Override
    public int getItemCount() {
        return driverLists.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgV;
        TextView driverName, team;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgV = itemView.findViewById(R.id.img_view);
            driverName = itemView.findViewById(R.id.text1);
            team = itemView.findViewById(R.id.text2);
        }
    }
}
