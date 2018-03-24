package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Krzysiek", "D.", 30);
        System.out.println("Imie " + person.getName()+ ", Nazwisko " + person.getSurname() + " Wiek " + person.getAge());

        // ^ inicjacja przez kontruktor

        Person person1 = new Person();
        person1.setName("Hubert");
        person1.setSurname("B.");
        person1.setAge(31);
        System.out.println("Imie " + person1.getName()+ ", Nazwisko " + person1.getSurname()+ " Wiek " + person1.getAge());

        // ^ inicjacja przez metody dostępowe

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        System.out.println(personList);

        for(Person p : personList) {
            System.out.println("Imie " + p.getName()+ ", Nazwisko " + p.getSurname()+ " Wiek " + p.getAge());

        }

        // ^ stworzenie pętli typu foreach

        for (int i = 0 ; i < personList.size(); i++) {
            System.out.println("Imie " + personList.get(i).getName()+ ", Nazwisko " + personList.get(i).getSurname()+ " Wiek " + personList.get(i).getAge());
        }









    }
}
