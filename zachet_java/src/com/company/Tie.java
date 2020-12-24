package com.company;

class Tie extends Clothes implements WearMan{
    public Tie(Sizes size, double cost, String color){
        super(size, cost, color);

    }
    @Override
    public String toString() {
        return "Галстук " +
                "размер = " + getsize() +
                ", цена = " + getcost() + "рублей " +
                ", цвет = " + getcolor();
    }
}
