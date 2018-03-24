package com.company.Zadanie6;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba ("Krzysiek", 30);
        Uczelnia uczelnia1 = new Uczelnia("Uniwersytet", "Pomorska");
        Student student1 = new Student ("Adam", 22, 3, uczelnia1);
        Wykladowca wykladowca1 = new Wykladowca("Mirek", 30);
        Student student2 = new Student(osoba1);
        System.out.println(student2);
        System.out.println(student1);
    }
}
