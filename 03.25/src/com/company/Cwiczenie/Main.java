package com.company.Cwiczenie;

public class Main {
    public static void main(String[] args) {

        Pojazd pojazd = new Pojazd("Pojazd");
        System.out.println("Informacje o pojezdzie: " + pojazd.wyswietlInformacje());

        Samochod samochod = new Samochod("Paserati", 4, 4);
        System.out.println("Informacje o samochodzie: " + samochod.wyswietlInformacje());

        Pociag pociag = new Pociag("Trambulino", 200, true);
        System.out.println("informacja o pociągu: " + pociag.wyswietlInformacje());

    }
}
