package com.example.and103_thanghtph31577_assignment.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.and103_thanghtph31577_assignment.DummyData;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.adapters.AddressAdapter;
import com.example.and103_thanghtph31577_assignment.databinding.ActivityCheckOutBinding;
import com.example.and103_thanghtph31577_assignment.models.Address;

import java.util.ArrayList;
import java.util.List;

public class CheckOutActivity extends AppCompatActivity {
    private ActivityCheckOutBinding binding;
    private List<Address> addressList;
    private AddressAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityCheckOutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        addressList = new ArrayList<>();
        addressList = DummyData.getAddress();
        adapter = new AddressAdapter(addressList, this);
        binding.rcvItem.setAdapter(adapter);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // Truyền dữ liệu nếu cần
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckOutActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    }
