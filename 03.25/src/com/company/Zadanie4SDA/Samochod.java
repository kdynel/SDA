package com.company.Zadanie4SDA;

public class Samochod extends Pojazd {

    int liczbaKol;
    int liczbaDrzwi;

    public Samochod(String nazwa, int liczbaKol, int liczbaDrzwi) {
        super(nazwa);
        this.liczbaKol = liczbaKol;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public int maxPredkosc() {
        return 200;
    }

    @Override
    public int liczbaPasazerow() {
        return 2;
    }

    @Override
    public String wyswietlDane() {
        return String.format("Nazwa: %s, prędkość: %s, liczba pasażerów: %s, liczba kół: %s, liczba drzwi: %s", nazwa, maxPredkosc(), liczbaPasazerow(), liczbaKol, liczbaDrzwi);
    }
}
