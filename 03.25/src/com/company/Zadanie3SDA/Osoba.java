package com.company.Zadanie3SDA;

// Utwórz klasy `Osoba` i `Pracownik` (dziedziczący z Osoby)
// oraz utwórz interfejs `PrzedstawSie` w którym będzie metoda `wyswietlDane()`.

public class Osoba implements PrzedstawSie {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String wyswietlDane() {
        return String.format("%s %s (%s)", imie, nazwisko, wiek);
    }
}
