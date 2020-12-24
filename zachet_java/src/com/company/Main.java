package com.company;

public class Main {

    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Sizes.M, 350, 'зеленый'),
                new Tie(Sizes.XS, 200, 'голубой'),
        };

        Atelier zachet_zheleznyakov = new Atelier();
        Atelier.dressMan(clothes);
        Atelier.dressWoman(clothes);
    }
    }

