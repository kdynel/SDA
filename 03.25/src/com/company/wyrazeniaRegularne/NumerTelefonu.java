package com.company.wyrazeniaRegularne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerTelefonu {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>(
                Arrays.asList("123456789", "123-123-123", "123-123123", "123123-123", "123-123-123-")
        );
        String wzorzec = "([0-9]{3}-){2}[0-9]{3}|[0-9]{9}";
        sprawdzWzorzec(listaStringow, wzorzec);
    }
    static void sprawdzWzorzec(List<String> lista, String wzorzec){
        for (String element : lista) {
            System.out.println(element + "\t" + (element.matches(wzorzec) ? "pasuje" : "nie pasuje"));
        }
    }
}
