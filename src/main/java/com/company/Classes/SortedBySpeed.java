package com.company.Classes;

import com.company.Classes.impls.Mashine;

import java.util.Comparator;

/**
 * Created by Asus on 03.05.2017.
 */
public class SortedBySpeed implements Comparator<Mashine> {
    public int compare(Mashine obj1, Mashine obj2) {
        double speed1 = obj1.getSpeed();
        double speed2 = obj2.getSpeed();

        if(speed1 < speed2) {
            return 1;
        }
        else if(speed1 > speed2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
