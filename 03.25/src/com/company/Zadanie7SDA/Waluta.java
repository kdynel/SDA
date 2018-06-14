package com.company.Zadanie7SDA;

// Utwórz typ wyliczeniowy `TypWaluty` zawieająca opcje `USD`, `EUR`, `PLN` wraz z opisem (`Dolar`, `Euro`,
// `Polski Złoty`). Utwórz klasę `Waluta`, gdzie jednym z pól będzie ten typ (oraz pola `kursSprzedazy`, `kursKupna`).

public class Waluta {
    private TypWaluty typ;
    private double kursKupna;
    private double kursSprzedazy;

    public Waluta(TypWaluty typ, double kursKupna, double kursSprzedazy) {
        this.typ = typ;
        this.kursKupna = kursKupna;
        this.kursSprzedazy = kursSprzedazy;
    }

    @Override
    public String toString() {
        return "Waluta{" +
                "typ=" + typ +
                ", kursKupna=" + kursKupna +
                ", kursSprzedazy=" + kursSprzedazy +
                ", roznica=" + liczRoznice() +
                '}';
    }


    private double liczRoznice(){
        return kursSprzedazy - kursKupna;
    }
}
