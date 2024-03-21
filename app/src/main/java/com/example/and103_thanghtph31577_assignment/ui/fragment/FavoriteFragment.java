package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and103_thanghtph31577_assignment.DummyData;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.adapters.WishAdapter;
import com.example.and103_thanghtph31577_assignment.config.GridSpacingItemDecoration;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentFavoriteBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;

import java.util.List;


public class FavoriteFragment extends Fragment {
    FragmentFavoriteBinding binding;

    private WishAdapter adapter;

    private List<Product> productList;
    private Context context;


    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFavoriteBinding.inflate(inflater, container  , false);
        // Inflate the layout for this fragment
        context = requireActivity();

        configAdapter();

        return binding.getRoot();
    }

    private void configAdapter() {
        productList = DummyData.generateDummyData();
        adapter = new WishAdapter(productList, context);
        GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
        int spacing = 30; // Khoảng cách giữa các item
        binding.rcvItem.addItemDecoration(new GridSpacingItemDecoration(spacing));
        binding.rcvItem.setLayoutManager(layoutManager);
        binding.rcvItem.setAdapter(adapter);

    }
}