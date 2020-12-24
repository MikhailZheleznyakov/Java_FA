package com.company;
public abstract class Clothes {

    private Sizes size;
    private int cost;
    private String color;

    public Clothes(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    public String getsize() {
        return size;
    }
    public int getcost() {
        return cost;
    }

    public String getcolor() {
        return color;
    }
    public void setcost(int cost) {
        this.cost = cost;
    }
}

