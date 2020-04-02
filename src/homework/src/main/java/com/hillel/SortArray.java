package com.hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {

    public static String sortArray(String str){
        String[] array = str.split(", ");
        List<Integer> list = new ArrayList<>();
        for (String number : array) {
            list.add(Integer.parseInt(number));
        }
        Collections.sort(list);
        return list.toString();
    }
}
