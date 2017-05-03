package com.company.TextFile;

import com.company.Classes.SortedBySpeed;
import com.company.Classes.impls.Bus.Bus;
import com.company.Classes.impls.Bus.CityBus;
import com.company.Classes.impls.Bus.LongDistanceBus;
import com.company.Classes.impls.Jeep.AWDJeep;
import com.company.Classes.impls.Jeep.Jeep;
import com.company.Classes.impls.Jeep.ThreeWheelJeep;
import com.company.Classes.impls.Mashine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Asus on 03.05.2017.
 */
public class MainTextFile
{
    private static final String FILENAME = "C:\\Users\\Asus\\Desktop\\Курси\\src\\main\\java\\com\\company\\TextFile\\text.txt";

    public static void main(String[] args) throws IOException {

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

        Collections.sort(mashines, new SortedBySpeed());
        try (FileWriter fileWriter = new FileWriter(FILENAME))
        {
            fileWriter.write(mashines.toString());
        }
        catch (IOException ex)
        {
            System.out.println("error");
        }


//        List<String> lines = Files.readAllLines(Paths.get(FILENAME), StandardCharsets.UTF_8);
//        for(String line: lines)
// {
//            System.out.println(line);
//        }
        FileReader fileReader = new FileReader(FILENAME);
        ArrayList<String> strings = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line = null;

            while ((line = bufferedReader.readLine())!= null)
            {
                strings.add(line);
            }
            bufferedReader.close();
        }
        System.out.println(strings);
    }
}
