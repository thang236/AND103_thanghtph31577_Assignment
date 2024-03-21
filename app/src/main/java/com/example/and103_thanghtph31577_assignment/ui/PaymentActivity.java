package com.example.and103_thanghtph31577_assignment.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.and103_thanghtph31577_assignment.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {
    private static final String TAG = "PaymentActivity";
    ActivityPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}