package com.example.and103_thanghtph31577_assignment.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.and103_thanghtph31577_assignment.databinding.ItemPopularBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;
import com.example.and103_thanghtph31577_assignment.ui.DetailsActivity;

import java.util.List;

public class MostAdapter extends RecyclerView.Adapter<MostAdapter.ViewHolder> {
    private List<Product> productList;
    private Context context;
    private static final int REQUEST_CODE = 1;

    public MostAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public MostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPopularBinding binding = ItemPopularBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MostAdapter.ViewHolder holder, int position) {
        Product product = productList.get(position);
        //using glide to load image
        Log.d("zzzzzz", "onBindViewHolder: " + product.getImage());
        Glide.with(context)
                .load(product.getImage()) // URL hoặc đường dẫn tới ảnh
                .into(holder.binding.imgProduct); // ImageView để hiển thị ảnh
        holder.binding.tvNameProduct.setText(product.getName());
        holder.binding.tvPriceProduct.setText(product.getPrice() + "$");
        holder.binding.tvDesProduct.setText(product.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                ((Activity) context).startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemPopularBinding binding;

        public ViewHolder(@NonNull ItemPopularBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
