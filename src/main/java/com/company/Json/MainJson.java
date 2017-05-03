package com.company.Json;
import com.company.Classes.SortedByName;
import com.company.Classes.impls.Bus.Bus;
import com.company.Classes.impls.Bus.CityBus;
import com.company.Classes.impls.Bus.LongDistanceBus;
import com.company.Classes.impls.Jeep.AWDJeep;
import com.company.Classes.impls.Jeep.Jeep;
import com.company.Classes.impls.Jeep.ThreeWheelJeep;
import com.company.Classes.impls.Mashine;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Asus on 03.05.2017.
 */
public class MainJson
{
    private static final String FILENAME = "C:\\Users\\Asus\\Desktop\\Курси\\src\\main\\java\\com\\company\\Json\\file.gson";
    public static void main(String[] args)
    {
        Bus bus = new Bus("bus",50,200,20,4);
        CityBus cityBus = new CityBus("cityBus",60,300,25,4,20);
        LongDistanceBus longDistanceBus = new LongDistanceBus("longDistanceBus",70,400,50,8);
        Jeep jeep = new Jeep("jeep",100,200,2);
        AWDJeep awdJeep = new AWDJeep("awdJeep",150,150,3,4,true);
        ThreeWheelJeep threeWheelJeep = new ThreeWheelJeep("threeWheelJeep",300,250,4);

        ArrayList<Mashine> mashines = new ArrayList<Mashine>();
        mashines.add(bus);
        mashines.add(cityBus);
        mashines.add(longDistanceBus);
        mashines.add(jeep);
        mashines.add(awdJeep);
        mashines.add(threeWheelJeep);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mashines);
        Collections.sort(mashines, new SortedByName());

        try (FileWriter fileWriter = new FileWriter(FILENAME))
        {
            fileWriter.write(json);
        }
        catch (IOException ex)
        {
            System.out.println("error");
        }
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME));
            ArrayList<Mashine> list = (ArrayList<Mashine>) gson.fromJson(json,new TypeToken<ArrayList<Mashine>>(){}.getRawType());
            System.out.println(list);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
        }

    }
}
