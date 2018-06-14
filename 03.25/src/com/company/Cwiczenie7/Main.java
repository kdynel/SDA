package com.company.Cwiczenie7;

public class Main {
    public static void main(String[] args) {
        Waluta dolar = new Waluta(3.95, 3.99, TypWaluty.USD);
        System.out.println(dolar);
        Waluta euro = new Waluta(4.30, 4.19, TypWaluty.EUR);
        System.out.println(euro);
        System.out.println(euro.obliczRozniceSprzedazy());
    }
}
