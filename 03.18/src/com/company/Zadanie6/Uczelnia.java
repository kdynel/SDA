package com.company.Zadanie6;

public class Uczelnia {
    private String nazwa;
    private String adres;

    public Uczelnia(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Uczelnia{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
