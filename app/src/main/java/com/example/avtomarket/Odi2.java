package com.example.avtomarket;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Odi2 extends RecyclerView.Adapter<Odi2.OdiViewHolder> {

    Context context;
    ArrayList<String> ismarraylist;
    ArrayList<Integer> rasmarraylist;

    public Odi2(Context context, ArrayList<String> ismarraylist, ArrayList<Integer> rasmarraylist) {
        this.context = context;
        this.ismarraylist = ismarraylist;
        this.rasmarraylist = rasmarraylist;
    }

    @NonNull
    @Override
    public OdiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.odilayout,parent,false);
        return new OdiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OdiViewHolder holder, int position) {
        holder.imageView.setImageResource(rasmarraylist.get(position));
        holder.textView.setText(ismarraylist.get(position));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity3.class);
                intent.putExtra("name",ismarraylist.get(position));
                intent.putExtra("image",rasmarraylist.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ismarraylist.size();
    }

    public class OdiViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        RelativeLayout relativeLayout;
        public OdiViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.relativelay);
            textView = itemView.findViewById(R.id.textview2);
            imageView = itemView.findViewById(R.id.imageview2);
        }
    }
}
