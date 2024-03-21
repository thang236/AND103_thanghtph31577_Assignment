package com.example.and103_thanghtph31577_assignment.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.and103_thanghtph31577_assignment.databinding.ItemMyFabHomeBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;

import java.util.List;

public class FabAdapter extends RecyclerView.Adapter<FabAdapter.ViewHolder> {
    private List<Product> productList;
    private Context context;

    public FabAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMyFabHomeBinding binding = ItemMyFabHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);
        //using glide to load image
        Glide.with(context).load(product.getImage()).into(holder.binding.imvProduct);
        holder.binding.tvNameProduct.setText(product.getName());
        holder.binding.tvPriceProduct.setText(product.getPrice() + "$");
        holder.binding.tvDesProduct.setText(product.getDescription());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMyFabHomeBinding binding;
        public ViewHolder(ItemMyFabHomeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
