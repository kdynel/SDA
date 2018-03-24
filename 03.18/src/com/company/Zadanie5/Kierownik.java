package com.company.Zadanie5;

public class Kierownik extends Pracownik {
    int premia;

    public Kierownik(String imie, int wiek, int pensja) {
        super(imie, wiek, pensja);
        this.premia = premia;
    }

    @Override
    public int policzPensje() {
        return super.policzPensje() + premia;
    }
}
