package com.company.Zadanie5SDA;

//Utwórz typ wyliczeniowy `Kolor` (zawierająca kilka opcji). Utwórz klasę `Samochod`, gdzie jednym z pól będzie ten typ.

public class Samochod {
    private String nazwa;
    private int rocznik;
    private Kolory kolorKaroserii;

    public Samochod(String nazwa, int rocznik, Kolory kolorKaroserii) {
        this.nazwa = nazwa;
        this.rocznik = rocznik;
        this.kolorKaroserii = kolorKaroserii;
    }

    void wyswietlAuto(){
        System.out.println("Mazwa auta: " + nazwa + " " + rocznik + " " + kolorKaroserii);
    }

//  ^  String wyswietlAuto() {
//        return String.format("Nazwa auta: %s, rocznik: %s, kolor karoserii: %s,", nazwa, rocznik, kolorKaroserii);
//
//    }
    //         System.out.println(samochod.wyswietlAuto());


    public void zmienKolor(Kolory nowyKolor) { kolorKaroserii = nowyKolor;
    }
}
