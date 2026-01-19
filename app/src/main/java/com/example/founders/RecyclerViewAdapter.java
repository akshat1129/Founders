package com.example.founders;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<MyListData> listdata;

    public RecyclerViewAdapter(List<MyListData> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyListData data = listdata.get(position);

        holder.tvName.setText(data.getName());
        holder.imageView.setImageResource(data.getImageId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), FounderDetailActivity.class);
            intent.putExtra("name", data.getName());
            intent.putExtra("description", data.getDescription());
            intent.putExtra("image", data.getImageId());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.ivImage);
            tvName = view.findViewById(R.id.tvName);
        }
    }
}
