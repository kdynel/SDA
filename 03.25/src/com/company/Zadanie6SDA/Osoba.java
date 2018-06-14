package com.company.Zadanie6SDA;

// Utwórz typ wyliczeniowy `Plec` (zawierająca dwie opcje). Utwórz klasę `Osoba`, gdzie jednym z pól będzie ten typ.
// Utwórz listę Osob (np. `ArrayList`) oraz metodę która zwróci nam liczbę pracowników wybranej (przez parametr) płci.

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private Plec plec;

    public Osoba(String imie, String nazwisko, int wiek, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
    }

    String wyswietlOsobe(){
        return String.format("\nImie i nazwisko: %s %s (%s lat) %s", imie, nazwisko, wiek, plec.opis);
    }

    @Override
    public String toString() {
        return wyswietlOsobe();
    }

    public Plec getPlec() {
        return plec;
    }
}
