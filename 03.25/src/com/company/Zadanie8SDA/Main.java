package com.company.Zadanie8SDA;

public class Main {
    public static void main(String[] args) {
        Komputer komputer1 = new Komputer();
        komputer1.setNazwaMarki(Marka.LENOVO);
        komputer1.setRodzajDysku(Dysk.HDD);
        System.out.println(komputer1);
    }
}
