package com.company.Zadanie3SDA;

public class Pracownik extends Osoba {

    int pensja;

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek);
        this.pensja = pensja;
    }

    @Override
    public String wyswietlDane() {
        return super.wyswietlDane() + " " + pensja;
    }
}

