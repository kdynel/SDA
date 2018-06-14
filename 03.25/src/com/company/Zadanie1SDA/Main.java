package com.company.Zadanie1SDA;

public class Main {

    public static void main(String[] args) {
        Kolo kolo = new Kolo(4);
        System.out.println("Pole koła: " + kolo.policzPole());
        System.out.println("Obwod koła: " + kolo.policzObwod());
        System.out.println("Objetosc walca o wysokosci: " + kolo.policzObjetosc(5));

        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println("Pole kwadratu: " + kwadrat.policzPole());
        System.out.println("obwod kwadratu: " + kwadrat.policzObwod());
        System.out.println("objetosc kwadratu: " + kwadrat.policzObjetosc(5));

        Prostokat prostokat = new Prostokat(2, 3);
        System.out.println("Pole prostokata: " + prostokat.policzPole());
        System.out.println("Obwod prostokata: " + prostokat.policzObwod());
        System.out.println("objetosc prostokata: " + prostokat.policzObjetosc(4));
    }
}
