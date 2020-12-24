package com.company;

class Pants extends Clothes implements WearMan, WearWoman{
    public Pants(Sizes size, double cost, String color){
        super(size, cost, color);

    }
    @Override
    public String toString() {
        return "Штаны " +
                "размер = " + getsize() +
                ", цена = " + getcost() + "рублей " +
                ", цвет = " + getcolor();
    }
}
