package com.company.Cwiczenie;

public class Pociag extends Pojazd {

    int liczbawagonow;
    boolean czyMaWagonBarowy;

    public Pociag(String nazwa, int liczbawagonow, boolean czyMaWagonBarowy) {
        super(nazwa);
        this.liczbawagonow = liczbawagonow;
        this.czyMaWagonBarowy = czyMaWagonBarowy;
    }

    public Pociag(String nazwa) {
        super(nazwa);
    }

    @Override
    public int maxPredkosc() {
        return 500;
    }

    @Override
    public int liczbaPasazerow() {
        return 2000;
    }

    @Override
    public String wyswietlInformacje() {
        return String.format("Nazwa pojazdu: %s, maksymalna prędkość: %s, liczna pasażerów: %s, Czy ma wagon barowy: %s, liczba wagonów: %s ",
                nazwa, maxPredkosc(), liczbaPasazerow(), czyMaWagonBarowy ? "tak" : "nie", liczbawagonow);
    }
}
