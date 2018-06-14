package com.company.Cwiczenie;

public class Samochod extends Pojazd {

    int liczbaKol;
    int liczbaDrzwi;

    public Samochod(String nazwa, int liczbaKol, int liczbaDrzwi) {
        super(nazwa);
        this.liczbaKol = liczbaKol;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public Samochod(String nazwa) {
        super(nazwa);
    }

    @Override
    public int maxPredkosc() {
        return 250;
    }

    @Override
    public int liczbaPasazerow() {
        return 2;
    }

    @Override
    public String wyswietlInformacje() {
        return String.format("Nazwa pojazdu: %s, maksymalna prędkość: %s, liczna pasażerów: %s, liczba kół: %s, liczba drzwi: %s", nazwa, maxPredkosc(), liczbaPasazerow(), liczbaKol, liczbaDrzwi);
    }
}
