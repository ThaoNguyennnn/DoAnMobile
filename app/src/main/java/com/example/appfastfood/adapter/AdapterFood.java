package com.example.appfastfood.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfastfood.R;
import com.example.appfastfood.classs.Custom_Food;
import com.example.appfastfood.menu.Showinfo_MenuFood;

import java.util.List;

public class AdapterFood extends RecyclerView.Adapter<AdapterFood.FoodViewHolder>{
    private Context mcontext;
    List<Custom_Food> list_foods;


    public AdapterFood(Context mcontext){
        this.mcontext = mcontext;
    }

    public void setData(List<Custom_Food> list_foods){
        this.list_foods = list_foods;
        notifyDataSetChanged();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{


        private TextView name,price,des;
        private ImageView imgFood;
        private Button btninfo;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameFood);
            price = (TextView) itemView.findViewById(R.id.priceFood);
            des = (TextView) itemView.findViewById(R.id.desFood);
            imgFood = (ImageView) itemView.findViewById(R.id.img_food);
            btninfo = (Button) itemView.findViewById(R.id.addbtnshow);
        }
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_menu,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Custom_Food food = list_foods.get(position);
        if(food == null){
            return;
        }

        holder.imgFood.setImageResource(food.getImmgFood());
        holder.name.setText(food.getNameFood());
        holder.price.setText(food.getPriceFood());
        holder.des.setText(food.getDesFood());

        holder.imgFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext,Showinfo_MenuFood.class);
                intent.putExtra("NameFood", food.getNameFood());
                intent.putExtra("ImgFood", food.getImmgFood());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        if(list_foods != null){
            return list_foods.size();
        }
        return 0;
    }

}
