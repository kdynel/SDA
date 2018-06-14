package com.company.Zadanie1SDA;

public class Kwadrat implements Obliczenia {

    private int bokKwadratu;

    public Kwadrat(int bokKwadratu) {
        this.bokKwadratu = bokKwadratu;
    }

    @Override
    public double policzPole() { return bokKwadratu * bokKwadratu;
    }

    @Override
    public double policzObwod() {
        return 4 + bokKwadratu;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }
}
