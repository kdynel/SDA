package com.company.Zadanie3SDA;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", "Kowalski", 45);
        System.out.println(osoba.wyswietlDane());

        Pracownik pracownik = new Pracownik("Piotr", "Kowalski", 20, 2000);
        System.out.println(pracownik.wyswietlDane());
    }
}
