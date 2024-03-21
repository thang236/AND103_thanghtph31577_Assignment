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

import com.bumptech.glide.Glide;
import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //use Glide to load image
        Glide.with(this).load("https://newfreshfoods.com.vn/datafiles/3/2018-02-27/16100958548622_hoaqua_1-500x500.jpg").into(binding.imvProduct);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // Truyền dữ liệu nếu cần
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}