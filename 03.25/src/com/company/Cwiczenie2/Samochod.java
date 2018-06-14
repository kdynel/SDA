package com.company.Cwiczenie2;

// Utwórz typ wyliczeniowy `Kolor` (zawierająca kilka opcji). Utwórz klasę `Samochod`, gdzie jednym z pól będzie ten typ.

public class Samochod {
    String nazwa;
    int rocznik;
    int maxPredkosc;
    Kolor kolor;

    public Samochod(String nazwa, int rocznik, int maxPredkosc, Kolor kolor) {
        this.nazwa = nazwa;
        this.rocznik = rocznik;
        this.maxPredkosc = maxPredkosc;
        this.kolor = kolor;
    }

    void wyswietlDane() {
        System.out.println(nazwa + " " + rocznik + " " + maxPredkosc + " " + kolor);


    }
}

