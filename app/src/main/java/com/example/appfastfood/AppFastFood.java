package com.example.appfastfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.appfastfood.menu.Menu_Frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppFastFood extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_fast_food);

        actionBar = getSupportActionBar();
        addControls();

        // Load Home Fragmment đầu tiên khi khởi động ứng dụng
        if (actionBar != null) {
            actionBar.setTitle("Home");
        }
        loadFragment(new Home_Frag());

        //Liên kết các item với các Frag thông qua id
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    if (actionBar != null) {
                        actionBar.setTitle("Home");
                    }
                    loadFragment(new Home_Frag());
                    return true;
                } else if (id == R.id.menu) {
                    if (actionBar != null) {
                        actionBar.setTitle("Menu");
                    }
                    loadFragment(new Menu_Frag());
                    return true;
                } else if (id == R.id.sale) {
                    if (actionBar != null) {
                        actionBar.setTitle("Sale");
                    }
                    loadFragment(new Sale_Frag());
                    return true;
                } else if (id == R.id.cart) {
                    if (actionBar != null) {
                        actionBar.setTitle("Cart");
                    }
                    loadFragment(new Cart_Frag());
                    return true;
                } else if (id == R.id.more) {
                    if (actionBar != null) {
                        actionBar.setTitle("More");
                    }
                    loadFragment(new More_Fragment());
                    return true;
                }

                return false;
            }
        });
    }

    private void addControls() {
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_option);
        frameFragment = (FrameLayout) findViewById(R.id.frameFrag);
    }

    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameFrag, fragment);
        ft.commit();
    }
}