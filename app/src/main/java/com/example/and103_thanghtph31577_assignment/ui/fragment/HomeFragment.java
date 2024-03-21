package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and103_thanghtph31577_assignment.DummyData;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.adapters.FabAdapter;
import com.example.and103_thanghtph31577_assignment.adapters.MostAdapter;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentHomeBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;

import java.util.List;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
 private FabAdapter fabAdapter;
    private MostAdapter mostAdapter;
    private List<Product> productList;
    private Context context;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        context = requireActivity();

        configAdapter();
        return binding.getRoot();
    }
    private void configAdapter() {
        productList = DummyData.generateDummyData();
        mostAdapter = new MostAdapter(productList, context);
        binding.rcvItem.setAdapter(mostAdapter);
        fabAdapter = new FabAdapter(productList, context);
        binding.rcvItemFab.setAdapter(fabAdapter);


    }
}