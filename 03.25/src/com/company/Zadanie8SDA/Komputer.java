package com.company.Zadanie8SDA;

public class Komputer {
    private Marka nazwaMarki;
    private Dysk rodzajDysku;
    private static String brakDanych = "brak";

    @Override
    public String toString() {
        return "Komputer{" +
                "nazwaMarki=" + (nazwaMarki == null ? brakDanych : nazwaMarki) +
                ", rodzajDysku=" + (rodzajDysku == null ? brakDanych : rodzajDysku) +
                '}';
    }

    public Marka getNazwaMarki() {
        return nazwaMarki;
    }

    public void setNazwaMarki(Marka nazwaMarki) {
        this.nazwaMarki = nazwaMarki;
    }

    public Dysk getRodzajDysku() {
        return rodzajDysku;
    }

    public void setRodzajDysku(Dysk rodzajDysku) {
        this.rodzajDysku = rodzajDysku;
    }
}
