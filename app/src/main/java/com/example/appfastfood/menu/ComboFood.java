package com.example.appfastfood.menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.appfastfood.R;
import com.example.appfastfood.adapter.AdapterFood;
import com.example.appfastfood.classs.Custom_Food;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ComboFood#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComboFood extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private AdapterFood adapterFood;
    List<Custom_Food> list_foods;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ComboFood() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ComboFood.
     */
    // TODO: Rename and change types and number of parameters
    public static ComboFood newInstance(String param1, String param2) {
        ComboFood fragment = new ComboFood();
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
        view = inflater.inflate(R.layout.fragment_combo_food, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recy_combo);
        adapterFood = new AdapterFood(getActivity());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapterFood.setData(getListFood());
        recyclerView.setAdapter(adapterFood);

        return view;
    }



    private List<Custom_Food> getListFood() {
        List<Custom_Food> list_food = new ArrayList<>();
        list_food.add(new Custom_Food("Combo Gà Rán", "87.000đ",
                "2 Miếng Gà +1 Khoai tây chiên vừa / 2 Gà Miếng Nuggets + 1 Lipton vừa", R.drawable.com1_1));
        list_food.add(new Custom_Food("Combo Mì Ý", "87.000đ",
                "1 Mì Ý Xốt Cà Gà Viên + 1 Miếng Gà+ 1 Lon Pepsi Can", R.drawable.com1_2));
        list_food.add(new Custom_Food("Combo Salad Hạt", "78.000đ",
                "1 Miếng Gà + 1 Salad Hạt + 1 Lon Pepsi", R.drawable.com1_3));
        list_food.add(new Custom_Food("Combo Burger", "89.000₫",
                "1 Burger Zinger/Burger Gà Quay Flava/Burger Tôm + 1 Miếng Gà Rán + 1 Lon Pepsi", R.drawable.com1_4));

        list_food.add(new Custom_Food("Combo Nhóm 1", "172.000đ",
                "3 Miếng Gà + 1 Burger Zinger/Burger Tôm/Burger Phi-lê Gà Quay + 2 Lon Pepsi", R.drawable.com1_5));
        list_food.add(new Custom_Food("Combo Nhóm 2", "191.000đ",
                "4 Miếng Gà + 1 Khoai tây chiên lớn / 2 Thanh Bí Phô-mai + 2 Pepsi Lon", R.drawable.com1_6));
        list_food.add(new Custom_Food("Combo Nhóm 3", "228.000đ",
                "5 Miếng Gà + 1 Popcorn (Vừa) / 4 Gà Miếng Nuggets+ 2 Pepsi Lon", R.drawable.com1_7));
        return list_food;
    }
}