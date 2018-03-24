package com.company.Petle;

import java.util.ArrayList;
import java.util.List;

public class ForAndForEach {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            Integer stringFromList = list.get(i);
            System.out.println(stringFromList);
        }

        for (Integer stringFromList : list) {
            System.out.println(stringFromList);
        }


    }



}
