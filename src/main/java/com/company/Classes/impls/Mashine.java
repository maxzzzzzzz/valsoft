package com.company.Classes.impls;

import com.company.Classes.interfaces.Run;

import java.io.Serializable;

/**
 * Created by Asus on 25.04.2017.
 */
public abstract class Mashine implements Run,Serializable
{
   public final int MAX_SPEED = 200;
   public final int MIN_SPEED = 0;
   public final int MAX_NUMBER_OF_PASSENGERS = 5;
   public final int MIN_NUMBER_OF_PASSENGERS = 0;
   private String name;
   private int speed;

    public Mashine(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }

    public Mashine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    abstract public String showName();

    @Override
    public String toString() {
        return "Mashine{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}' + "\n";
    }
}

