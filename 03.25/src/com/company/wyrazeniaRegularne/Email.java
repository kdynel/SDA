package com.company.wyrazeniaRegularne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Email {
    public static void main(String[] args) {
        List<String> listraStringow = new ArrayList<>(Arrays.asList(
                "sd12@wp.pl",
                "md38@s.pl",
                "sd.as-2a@dhsj.das",
                "@jfj.h",
                "dupa@dupa.pl."));

        String wzorzec = "([1-9a-z]+[.-]?)+[1-9a-z]+@([1-9a-z]+[.-]?)*[1-9a-z]+.[a-z]+";
        sprawdzWzorzec(listraStringow, wzorzec);
    }

    static void sprawdzWzorzec(List<String> lista, String wzorzec) {
        for (String element : lista) {
            System.out.println((element.matches(wzorzec) ? "pasuje do wzorca" : "nie pasuje do wzorca") + "\t" + element);
        }
    }
}
