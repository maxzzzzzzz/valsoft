package com.company.SerializationFile;

import com.company.Classes.SortedBySpeed;
import com.company.Classes.impls.Bus.Bus;
import com.company.Classes.impls.Bus.CityBus;
import com.company.Classes.impls.Bus.LongDistanceBus;
import com.company.Classes.impls.Jeep.AWDJeep;
import com.company.Classes.impls.Jeep.Jeep;
import com.company.Classes.impls.Jeep.ThreeWheelJeep;
import com.company.Classes.impls.Mashine;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Asus on 03.05.2017.
 */
public class MainSerialization implements Serializable
{
    private static  ArrayList<Mashine> mashines = new ArrayList<Mashine>();
    public static void main(String[] args)
    {

        mashines= (ArrayList<Mashine>) desDate("File");
        Bus bus = new Bus("bus",50,200,20,4);
        CityBus cityBus = new CityBus("cityBus",60,300,25,4,20);
        LongDistanceBus longDistanceBus = new LongDistanceBus("longDistanceBus",70,400,50,8);
        Jeep jeep = new Jeep("jeep",100,200,2);
        AWDJeep awdJeep = new AWDJeep("awdJeep",150,150,3,4,true);
        ThreeWheelJeep threeWheelJeep = new ThreeWheelJeep("threeWheelJeep",300,250,4);

        mashines.add(bus);
        mashines.add(cityBus);
        mashines.add(longDistanceBus);
        mashines.add(jeep);
        mashines.add(awdJeep);
        mashines.add(threeWheelJeep);




        System.out.println(mashines.size());
        System.out.println("before sorting");
        for(Mashine mashine : mashines)
        {
            System.out.println(mashine.toString());
        }
        System.out.println("------------after sorting------------");
        Collections.sort(mashines,new SortedBySpeed());
        for(Mashine s: mashines)
        {
            System.out.println(s.toString());
        }
        serDate("File",mashines);






    }

    private static Object desDate(String file_name){
        Object retObject = null;
        try{
            FileInputStream fileIn = new FileInputStream(file_name+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObject = in.readObject();
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
            System.exit(3);
        }
        return retObject;
    }
    private static void serDate(String file_name,Object obj){
        try{
            FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);//выйдет с программы
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }
    }
}

