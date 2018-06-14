package com.company.Zadanie1SDA;

// Utwórz klasy:
//
//`Prostokat` (z polami `dlugosc`, `szerokosc`),
//
//`Kwadrat` (z bolem `dlugosc`),
//
//`Koło` (z polem `promien`).
//Utwórz interfejs `Obliczenia` w którym będą metody `policzPole()`,
// `policzObwod()` oraz `policzObjetosc(int wysokosc)`. Interfejs ten zaimplementuj we wcześniej utworzonych klasach.

public class Prostokat implements Obliczenia {

    private int dlugosc;
    private int szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    @Override
    public double policzPole() {
        return dlugosc + szerokosc;
    }

    @Override
    public double policzObwod() {
        return 2 * dlugosc + 2 * szerokosc;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }
}
