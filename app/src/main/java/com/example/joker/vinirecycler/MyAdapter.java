package com.example.joker.vinirecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<String> userName;
    private List<String> userDesc;

    public MyAdapter(Context context, List<String> userName, List<String> userDesc) {
        this.context = context;
        this.userName = userName;
        this.userDesc = userDesc;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String name = userName.get(position);
        String desc = userDesc.get(position);

        holder.nameTV.setText(name);
        holder.descTV.setText(desc);


    }


    @Override
    public int getItemCount() {
        return userName.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV,descTV;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.title_textView);
            descTV = itemView.findViewById(R.id.desc_textView);

        }
    }


}
