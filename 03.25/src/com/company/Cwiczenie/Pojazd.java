package com.company.Cwiczenie;

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
        return 190;
    }

    @Override
    public int liczbaPasazerow() {
        return 5;
    }

    @Override
    public String wyswietlInformacje() {
        return String.format("Nazwa pojazdu: %s, maksymalna prędkość: %s, liczna pasażerów: %s", nazwa, maxPredkosc(), liczbaPasazerow());
    }
}
