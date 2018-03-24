package com.company.ProgramowanieObiektowe.Zadanie1SDA;

// Utwórz klasę Rectangle (Prostokąt) posiadającą
//    pola reprezentujące:
//
//        dłuższy bok
//        krótszy bok
//
//
//    metody służące do:
//
//        policzenia obwodu
//        policzenia pola powierzchni
//        porównania czy pola powierzchni dwóch przekazanych prostokątów są takie same (zwracająca wartość boolean)

public class Main {
    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(3,5);
        Prostokat prostokat2 = new Prostokat(5,4);
        System.out.println("Twój obwód to: " + prostokat.policzenieObwodu());
        System.out.println("Twój obwód to: " + prostokat2.policzenieObwodu());
        boolean wynik = Prostokat.porownaniePola(prostokat, prostokat2);
        System.out.println(wynik);



    }
}
