package com.company.Zadanie6SDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Osoba> listaPracownikow;

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Piotr", "Konin", 40, Plec.M);
        Osoba osoba1 = new Osoba("Karolina", "Włodarczyk", 50, Plec.K);
        Osoba osoba2 = new Osoba("Paweł", "Kowalski", 12, Plec.M);
        Osoba osoba3 = new Osoba("Jan", "Zielka", 87, Plec.M);

        listaPracownikow = new ArrayList<>(Arrays.asList(osoba, osoba1, osoba2, osoba3));

        System.out.println(listaPracownikow.toString());
        System.out.println(zliczOsobyDanejPlci(Plec.K));
        System.out.println(zliczOsobyDanejPlci(Plec.M));

    }

    static int zliczOsobyDanejPlci(Plec plec) {
        int ktoraPlec = 0;
        for (int i = 0; i < listaPracownikow.size(); i++) {
            if (listaPracownikow.get(i).getPlec() == plec) {
                    ktoraPlec++;
            }
        }
        return ktoraPlec;
    }
}

// for (Osoba pracownik : listaPracownikow) {
// if (pracownik.getplec() == plec) {
//licznik++