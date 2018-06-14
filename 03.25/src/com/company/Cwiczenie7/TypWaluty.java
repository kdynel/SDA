package com.company.Cwiczenie7;

public  enum TypWaluty {
    USD("Dolar"), EUR("Euro"), PLN("Złoty"); //dodaje pola wraz z opisem
    String opis; // tworze String opis i  ponizej konstruktor

    TypWaluty(String opis) {
        this.opis = opis;
    }
}
