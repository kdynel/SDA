package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie5SDAniedziela;

// Utwórz klasę Pracownik posiadającą
//
//    pola reprezentujące:
//
//        imie
//        drugie imie
//        nazwisko
//        wiek
//        płeć (true = kobieta, false = mężczyzna)
//        pensję
//        adres (z poprzedniego zadania)
//
//    gettery & settery
//
//    następujące kostruktory:
//
//        bezparametrowy
//        2-parametrowy (przyjmujący imię, nazwisko i płeć)
//
//    metody zwracające:
//
//        imie, drugie imie (jeśli istnieje!) i nazwisko (jako jeden string)
//        płec w formie tekstowej (tzn. Kobieta lub Mężczyzna)
//        liczbę lat pozostałych do emerytury (dla Kobiet 60, dla Mężczyzn 65)

public class Pracownik {

    String imie;
    String drugieImie;
    String nazwisko;
    int wiek;
    boolean plec;
    int pensja;
    String adres;

    public Pracownik(String imie, String nazwisko, boolean plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    String zwrocImieNazwiskoPlec() {
        if (drugieImie == null) {
            return String.format("%s %s", imie,nazwisko);
        }
        return String.format("%s %s %s", imie, drugieImie, nazwisko);
    }
    String wyswietlPlec(){
        return String.format(plec ? "mężczyzna" : "kobieta");
    }

    int liczbaLatDoEmerytury(int podajwiek){
        return plec ? (65 - podajwiek) : (60 - podajwiek);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getDrugieImie() {
        return drugieImie;
    }

    public void setDrugieImie(String drugieImie) {
        this.drugieImie = drugieImie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
