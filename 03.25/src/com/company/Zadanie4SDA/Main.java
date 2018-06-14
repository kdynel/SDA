package com.company.Zadanie4SDA;

public class Main {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd("Pojazd");
        System.out.println(pojazd.wyswietlDane());
        Samochod samochod = new Samochod("Samochód", 4, 4);
        System.out.println(samochod.wyswietlDane());
        Pociag pociag = new Pociag("Pociąg", 200, false);
        System.out.println(pociag.wyswietlDane());
    }
}
