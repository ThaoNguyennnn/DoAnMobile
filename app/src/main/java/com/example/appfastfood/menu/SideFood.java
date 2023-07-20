package com.example.appfastfood.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appfastfood.R;
import com.example.appfastfood.adapter.AdapterFood;
import com.example.appfastfood.classs.Custom_Food;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SideFood#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SideFood extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private AdapterFood adapterFood;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SideFood() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SideFood.
     */
    // TODO: Rename and change types and number of parameters
    public static SideFood newInstance(String param1, String param2) {
        SideFood fragment = new SideFood();
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
        view = inflater.inflate(R.layout.fragment_side_food, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recy_side);
        adapterFood = new AdapterFood(getActivity());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapterFood.setData(getListFood());
        recyclerView.setAdapter(adapterFood);

        return view;
    }
    private List<Custom_Food> getListFood(){
        List<Custom_Food> list_food = new ArrayList<>();
        list_food.add(new Custom_Food("1 Bánh Trứng","18.000đ",
                "1 Bánh Trứng",R.drawable.sidefood1));
        list_food.add(new Custom_Food("4 Bánh Trứng","58.000đ",
                "4 Bánh Trứng",R.drawable.sidefood2));
        list_food.add(new Custom_Food("2 Viên Khoai Môn Kim Sa","26.000đ",
                "2 Viên Khoai Môn Kim Sa",R.drawable.sidefood3));
        list_food.add(new Custom_Food("3 Viên Khoai Môn Kim Sa","34.000₫",
                "3 Viên Khoai Môn Kim Sa",R.drawable.sidefood4));
        list_food.add(new Custom_Food("5 Viên Khoai Môn Kim Sa","54.000đ",
                "5 Viên Khoai Môn Kim Sa",R.drawable.sidefood5));
        list_food.add(new Custom_Food("2 Thanh Bí Phô Mai","28.000đ",
                "2 Thanh Bí Phô Mai",R.drawable.sidefood6));
        list_food.add(new Custom_Food("5 Thanh Bí Phô Mai","58.000đ",
                "5 Thanh Bí Phô Mai",R.drawable.sidefood7));
        return list_food;
    }
}