package com.company;

class Skirt extends Clothes implements WearWoman{
    public Skirt(Sizes size, double cost, String color){
        super(size, cost, color);

    }
    @Override
    public String toString() {
        return "Юбка " +
                "размер = " + getsize() +
                ", цена = " + getcost() + "рублей " +
                ", цвет = " + getcolor();
    }
}