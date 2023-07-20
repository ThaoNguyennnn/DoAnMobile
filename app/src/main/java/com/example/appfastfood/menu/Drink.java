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
 * Use the {@link Drink#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Drink extends Fragment {

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

    public Drink() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Drink.
     */
    // TODO: Rename and change types and number of parameters
    public static Drink newInstance(String param1, String param2) {
        Drink fragment = new Drink();
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
        view = inflater.inflate(R.layout.fragment_drink, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recy_drink);
        adapterFood = new AdapterFood(getActivity());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapterFood.setData(getListFood());
        recyclerView.setAdapter(adapterFood);

        return view;
    }
    private List<Custom_Food> getListFood(){
        List<Custom_Food> list_food = new ArrayList<>();
        list_food.add(new Custom_Food("Pepsi Lon","17.000đ",
                "Pepsi Lon",R.drawable.drink1));
        list_food.add(new Custom_Food("7Up Lon","17.000đ",
                "7Up Lon",R.drawable.drink2));
        list_food.add(new Custom_Food("Aquafina 500ml","15.000đ",
                "Aquafina 500ml",R.drawable.drink3));
        list_food.add(new Custom_Food("Trà Đào","24.000₫",
                "Trà Đào",R.drawable.drink4));
        list_food.add(new Custom_Food("Pepsi Black Lime Lon","17.000đ",
                "Pepsi Black Lime Lon",R.drawable.drink5));
        list_food.add(new Custom_Food("Mirinda Cam Lon","17.000đ",
                "Mirinda Cam Lon",R.drawable.drink6));
        list_food.add(new Custom_Food("Trà Chanh Lipton (Lớn)","17.000đ",
                "Trà Chanh Lipton (Lớn)",R.drawable.drink7));
        list_food.add(new Custom_Food("Trà Chanh Lipton (Vừa)","10.000đ",
                "Trà Chanh Lipton (Vừa)",R.drawable.drink8));
        return list_food;
    }
}