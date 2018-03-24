package com.company;
// Utwórz metodę, która przyjmuje dwa parametry - listę liczb (np. `ArrayList`) oraz indeks za którym należy “przeciąć” tablicę i zwrócić drugą część.
//Dla `3` oraz `<1, 7, 8, 22, 10, -2, 33>`
//powinno zwrócić `<10, -2, 33>`

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {
        List<Integer> lista = wypelnij(10);
        System.out.println(lista);
        System.out.println(podzielona(lista, 3));
    }
    private static List<Integer> wypelnij(int rozmiar) {
        Random r = new Random();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i < rozmiar ; i++) {
            temp.add(r.nextInt(30));

        }
        return temp;
        }
        private static List<Integer> podzielona(List<Integer> lista, int podzielony) {
        List<Integer> listaKoncowa = new ArrayList<>();
            for (int i = podzielony +1; i < lista.size(); i++) {
                listaKoncowa.add(lista.get(i));
            }
            return listaKoncowa;
        }
}
