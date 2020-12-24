package com.company;

public class Tshirt extends Clothes implements WearMan, WearWoman{
    public Tshirt(Sizes size, double cost, String color){
        super(size, cost, color);

    }
    @Override
    public String toString() {
        return "Футболка " +
                "размер = " + getsize() +
                ", цена = " + getcost() + "рублей " +
                ", цвет = " + getcolor();
    }
}
