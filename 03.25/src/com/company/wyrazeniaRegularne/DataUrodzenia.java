package com.company.wyrazeniaRegularne;

// 7.10.1987 07.10.1987 05.05.2015

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataUrodzenia {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>(Arrays.asList(
                "7.10.1987",
                "07.10.1987",
                ".7.10.1987",
                "7.101.1987.",
                "05.05.2015"
        ));
        String wzorzec = "0?[1-9]/.[1-9][1-9]/.[1-9][1-9][1-9][1-9]";
        sprawdzWzorzec(listaStringow, wzorzec);
    }
    static void sprawdzWzorzec (List<String> lista, String wzorzec) {
        for (String element : lista) {
            System.out.println(element + "\t" + (element.matches(wzorzec) ? "pasuje" : "nie pasuje"));
        }
    }
}

