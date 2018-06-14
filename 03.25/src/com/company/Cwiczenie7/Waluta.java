package com.company.Cwiczenie7;

// Utwórz typ wyliczeniowy `TypWaluty` zawieająca opcje `USD`, `EUR`, `PLN` wraz z opisem (`Dolar`, `Euro`,
// `Polski Złoty`). Utwórz klasę `Waluta`, gdzie jednym z pól będzie ten typ (oraz pola `kursSprzedazy`, `kursKupna`).

public class Waluta {
    double kursSprzedazy;
    double kursKupna;
    TypWaluty typWaluty;

    public Waluta(double kursSprzedazy, double kursKupna, TypWaluty typWaluty) {
        this.kursSprzedazy = kursSprzedazy;
        this.kursKupna = kursKupna;
        this.typWaluty = typWaluty;
    }

    public double obliczRozniceSprzedazy(){ // stworzyłem metode do obliczenia roznicy ze sprzedazy waluty
        return kursSprzedazy - kursKupna;
    }

    @Override
    public String toString() { // toString dla wyswietlania informacji
        return "Waluta{" +
                "kursSprzedazy=" + kursSprzedazy +
                ", kursKupna=" + kursKupna +
                ", typWaluty=" + typWaluty +
                ", roznica ze sprzedaży=" + obliczRozniceSprzedazy() +
                '}';
    }
}
