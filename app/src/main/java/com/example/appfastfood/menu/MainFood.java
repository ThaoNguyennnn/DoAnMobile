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
 * Use the {@link MainFood#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFood extends Fragment {

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

    public MainFood() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFood.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFood newInstance(String param1, String param2) {
        MainFood fragment = new MainFood();
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
        view = inflater.inflate(R.layout.fragment_main_food, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recy_main);
        adapterFood = new AdapterFood(getActivity());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapterFood.setData(getListFood());
        recyclerView.setAdapter(adapterFood);

        return view;
    }
    private List<Custom_Food> getListFood(){
        List<Custom_Food> list_food = new ArrayList<>();
        list_food.add(new Custom_Food("3 Miếng Gà Rán","103.000đ",
                "3 Miếng Gà Giòn Cay/Gà Truyền Thống/Gà Giòn Không Cay",R.drawable.main1));
        list_food.add(new Custom_Food("6 Miếng Gà Rán","201.000đ",
                "6 Miếng Gà Giòn Cay/Gà Truyền Thống/Gà Giòn Không Cay",R.drawable.main2));
        list_food.add(new Custom_Food("Gà Viên (Vừa)","38.000đ",
                "Gà Viên (Vừa)",R.drawable.main3));
        list_food.add(new Custom_Food("Gà Viên (Lớn)","63.000₫",
                "Gà Viên (Lớn)",R.drawable.main4));
        list_food.add(new Custom_Food("Burger Zinger","54.000đ",
                "1 Burger Zinger",R.drawable.main5));
        list_food.add(new Custom_Food("Burger Tôm","44.000đ",
                "1 Burger Tôm",R.drawable.main6));
        list_food.add(new Custom_Food("Burger Gà Quay Flava","54.000đ",
                "1 Burger Gà Quay Flava",R.drawable.main7));
        list_food.add(new Custom_Food("Mì Ý Xốt Cà Xúc Xích Gà Viên","40.000đ",
                "1 Mì Ý Xốt Cà Xúc Xích Gà Viên",R.drawable.main8));
        list_food.add(new Custom_Food("Mì Ý Xốt Cà Xúc Xích Gà Zinger","60.000đ",
                "1 Mì Ý Xốt Cà Xúc Xích Gà Zinger",R.drawable.main9));
        return list_food;
    }
}