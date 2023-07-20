package com.example.appfastfood.menu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.appfastfood.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Menu_Frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Menu_Frag extends Fragment {

    View view;
    ActionBar actionBar;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameFragment;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Menu_Frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Menu_Frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Menu_Frag newInstance(String param1, String param2) {
        Menu_Frag fragment = new Menu_Frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_menu_, container, false);

        bottomNavigationView = view.findViewById(R.id.menu_nav);
        frameFragment = view.findViewById(R.id.menu_fram);

        // Get the parent activity's ActionBar
        actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        // Khởi động đầu tiên là layout combo
        if (actionBar != null) {
            actionBar.setTitle("Combo");
        }
        loadFragment(new ComboFood());

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.combo) {
                    if (actionBar != null) {
                        actionBar.setTitle("Combo");
                    }
                    loadFragment(new ComboFood());
                    return true;
                }
                else if (id == R.id.mainfood) {
                    if (actionBar != null) {
                        actionBar.setTitle("Món Chính");
                    }
                    loadFragment(new MainFood());
                    return true;
                }
                else if (id == R.id.sidefood) {
                    if (actionBar != null) {
                        actionBar.setTitle("Tráng Miệng");
                    }
                    loadFragment(new SideFood());
                    return true;
                }
                else if (id == R.id.drinks) {
                    if (actionBar != null) {
                        actionBar.setTitle("Nước Uống");
                    }
                    loadFragment(new Drink());
                    return true;
                }

                return false;
            }
        });

        return view;
    }

    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.menu_fram, fragment);
        ft.commit();
    }
}