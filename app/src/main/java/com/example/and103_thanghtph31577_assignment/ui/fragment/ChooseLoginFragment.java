package com.example.and103_thanghtph31577_assignment.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and103_thanghtph31577_assignment.R;
import com.example.and103_thanghtph31577_assignment.databinding.FragmentChooseLoginBinding;


public class ChooseLoginFragment extends Fragment {
 private FragmentChooseLoginBinding binding;

    public ChooseLoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentChooseLoginBinding.inflate(inflater, container, false);
        userListener();
        return binding.getRoot();
    }

    private void userListener() {
        binding.btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginByPhoneFragment fragment = new LoginByPhoneFragment();
               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
            }
        });

        binding.btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginByEmailFragment fragment = new LoginByEmailFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
            }
        });

    }
}