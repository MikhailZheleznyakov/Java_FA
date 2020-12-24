package com.company;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WearMan) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WearWoman) {
                System.out.println(clothe);
            }
        }
    }
}
