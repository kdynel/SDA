package com.company.wyrazeniaRegularne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdresHTTP {
    public static void main(String[] args) {
        List<String> listraStringow = new ArrayList<>(Arrays.asList(
                "http://fhsjs.dnd",
                "//http://fhs.11js.dnd/",
                "fhsjs.dnd.pl",
                "onet.pl",
                "www.dupa.pl/@",
                "ska.oi{}(/.pl",
                "www.wp.pl",
                "https://fhsjs.dnd"));

        String wzorzec = "(https?://)?([a-z0-9]+\\.)+[a-z0-9]{2,}/?";
        sprawdzWzorzec(listraStringow, wzorzec);
    }

    static void sprawdzWzorzec(List<String> lista, String wzorzec) {
        for (String element : lista) {
            System.out.println((element.matches(wzorzec) ? "pasuje do wzorca" : "nie pasuje do wzorca") + "\t" + element);
        }
    }
}