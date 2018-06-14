package com.company.Zadanie5SDA;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("tico", 2017, Kolory.CZARNY);
        samochod.wyswietlAuto();
        samochod.zmienKolor(Kolory.BIALY);
        samochod.wyswietlAuto();
        samochod.zmienKolor(Kolory.ZIELONY);
        samochod.wyswietlAuto();
    }
}
