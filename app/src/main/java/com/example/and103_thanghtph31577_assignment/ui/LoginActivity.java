package com.example.and103_thanghtph31577_assignment.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.databinding.ActivityLoginBinding;
import com.example.and103_thanghtph31577_assignment.ui.fragment.ChooseLoginFragment;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        ChooseLoginFragment fragment = new ChooseLoginFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

    }
