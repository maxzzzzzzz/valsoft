package com.company.Classes;

import com.company.Classes.impls.Mashine;

import java.util.Comparator;

/**
 * Created by Asus on 03.05.2017.
 */
public class SortedByName implements Comparator<Mashine> {


    public int compare(Mashine obj1, Mashine obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}
