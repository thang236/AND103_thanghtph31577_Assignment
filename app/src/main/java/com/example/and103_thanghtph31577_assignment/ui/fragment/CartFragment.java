package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and103_thanghtph31577_assignment.DummyData;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.adapters.CardAdapter;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentCartBinding;
import com.example.and103_thanghtph31577_assignment.models.Product;
import com.example.and103_thanghtph31577_assignment.ui.CheckOutActivity;

import java.util.List;


public class CartFragment extends Fragment {
    private FragmentCartBinding binding;
    private List<Product> cartList;
    private CardAdapter cardAdapter;

    private Context context;
    private static final int REQUEST_CODE = 1;



    public CartFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCartBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        context = requireActivity();

        configAdapter();

        binding.btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CheckOutActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
        return  binding.getRoot();
    }

    private void configAdapter() {
        cartList = DummyData.generateDummyData();
        cardAdapter = new CardAdapter(cartList, context);
        binding.rcvItem.setAdapter(cardAdapter);

    }
}