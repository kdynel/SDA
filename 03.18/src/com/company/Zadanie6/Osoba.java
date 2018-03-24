package com.company.Zadanie6;

// Utwórz klasę `Osoba`, która zawiera pola `imie`, `wiek`. Utwórz klasę `Student` (z dodatkowymi polami jak `Uczelnia` i `rokStudiow`)
// oraz `Wykladowca` (z polami `Uczelnia`). Utwórz klasę `Uczelnia` (z polami `nazwa` i `adres`)

public class Osoba {
    protected String imie;
    protected int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
}

