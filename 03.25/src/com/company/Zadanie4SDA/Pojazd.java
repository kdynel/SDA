package com.company.Zadanie4SDA;

// Utwórz klasę `Pojazd` (z polami `nazwa`) a następnie dziedziczące klasy klasy `Samochod` (z polami `liczbaKol` i `
// liczbaDrzwi`) i `Pociag` (z polami `liczbaWagonow`, `czyMaWagonBarowy`). Utwórz interfejs `CharakterystykaPojazdu`,
// zawierający metody `maxPredkosc` oraz `liczbaPasazerow`.

public class Pojazd implements CharakterystykaPojazdu {

    String nazwa;

    public Pojazd(String nazwa) {
        this.nazwa = nazwa;

    }

    @Override
    public int maxPredkosc() {
        return 25;
    }

    @Override
    public int liczbaPasazerow() {
        return 1;
    }

    @Override
    public String wyswietlDane() {
        return String.format("Nazwa: %s, prędkość: %s, liczba pasażerów: %s", nazwa, maxPredkosc(), liczbaPasazerow());
    }
}
