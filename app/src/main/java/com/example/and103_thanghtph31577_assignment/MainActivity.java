package com.example.and103_thanghtph31577_assignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.and103_thanghtph31577_assignment.databinding.ActivityMainBinding;
import com.example.and103_thanghtph31577_assignment.ui.fragment.CartFragment;
import com.example.and103_thanghtph31577_assignment.ui.fragment.FavoriteFragment;
import com.example.and103_thanghtph31577_assignment.ui.fragment.HomeFragment;
import com.example.and103_thanghtph31577_assignment.ui.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Fragment homeFragment;
    private Fragment favoriteFragment;
    private Fragment cartFragment;
    private Fragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        binding.bottomNavigation.show(1, true);
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.home));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.heart_outlined_icon));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.cart_icon));
        binding.bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.setting_icon));

        // Khởi tạo các Fragment
        homeFragment = new HomeFragment();
        favoriteFragment = new FavoriteFragment();
        cartFragment = new CartFragment();
        profileFragment = new ProfileFragment();


        setFragment(homeFragment);
        // Xử lý sự kiện khi người dùng click vào các tab trên Navigation Bar
        binding.bottomNavigation.setOnClickMenuListener(item -> {
            switch (item.getId()) {
                case 1:
                    setFragment(homeFragment);
                    break;
                case 2:
                    setFragment(favoriteFragment);
                    break;
                case 3:
                    setFragment(cartFragment);
                    break;
                case 4:
                    setFragment(profileFragment);
                    break;
            }
            return null;
        });
    }


    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}