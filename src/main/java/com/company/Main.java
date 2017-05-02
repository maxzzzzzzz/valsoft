package com.company;

import com.company.impls.Bus.Bus;
import com.company.impls.Bus.CityBus;
import com.company.impls.Bus.LongDistanceBus;
import com.company.impls.Jeep.AWDJeep;
import com.company.impls.Jeep.Jeep;
import com.company.impls.Jeep.ThreeWheelJeep;

public class Main {

    public static void main(String[] args)
    {
        Bus bus = new Bus("bus",50,200,20,4);
        CityBus cityBus = new CityBus("cityBus",60,300,25,4,20);
        LongDistanceBus longDistanceBus = new LongDistanceBus("longDistanceBus",70,400,50,8);
        Jeep jeep = new Jeep("jeep",100,200,2);
        AWDJeep awdJeep = new AWDJeep("awdJeep",150,150,3,4,true);
        ThreeWheelJeep threeWheelJeep = new ThreeWheelJeep("threeWheelJeep",300,250,4);

        System.out.println(bus.toString());
        System.out.println(cityBus.toString());
        System.out.println(longDistanceBus.toString());
        System.out.println(jeep.toString());
        System.out.println(awdJeep.toString());
        System.out.println(threeWheelJeep.toString());
    }
}