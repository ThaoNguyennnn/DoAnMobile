package com.example.appfastfood.classs;

public class Custom_Food {
    private String nameFood,priceFood,desFood;
    private int immgFood;

    public Custom_Food(String nameFood, String priceFood, String desFood, int immgFood) {
        this.nameFood = nameFood;
        this.priceFood = priceFood;
        this.desFood = desFood;
        this.immgFood = immgFood;
    }

    public  Custom_Food(){

    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(String priceFood) {
        this.priceFood = priceFood;
    }

    public String getDesFood() {
        return desFood;
    }

    public void setDesFood(String desFood) {
        this.desFood = desFood;
    }

    public int getImmgFood() {
        return immgFood;
    }

    public void setImmgFood(int immgFood) {
        this.immgFood = immgFood;
    }


}
