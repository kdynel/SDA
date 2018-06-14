package com.company.Zadanie1SDA;

public class Kolo implements Obliczenia {

    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    @Override
    public double policzPole() {
        return Math.PI * Math.pow(promien, 2);
    }

    @Override
    public double policzObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return policzPole() * wysokosc;
    }
}
