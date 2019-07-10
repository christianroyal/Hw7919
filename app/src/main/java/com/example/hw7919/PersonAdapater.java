package com.example.hw7919;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapater extends RecyclerView.Adapter<PersonAdapater.ViewHolder>{

    private List<Person> items;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.personitem,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person= items.get(position);

        holder.tvName.setText(person.getName());
        holder.tvPhone.setText(person.getPhone());

    }

    public PersonAdapater(List<Person> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPhoto;
        TextView tvName,tvPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto=itemView.findViewById(R.id.iv_photo);
            tvName=itemView.findViewById(R.id.tv_name);
            tvPhone=itemView.findViewById(R.id.tv_phone);
        }
    }


}
