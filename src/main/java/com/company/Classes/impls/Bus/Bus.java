package com.company.Classes.impls.Bus;

import com.company.Classes.impls.Mashine;

import java.io.Serializable;

/**
 * Created by Asus on 27.04.2017.
 */
public class Bus extends Mashine implements Serializable
{
    private int weight;
    private int numberOfPassengers;
    private int numberOfWheels;

    public Bus(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels) {
        super(name, speed);
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String showName() {
        return "Bus";
    }

    @Override
    public String toString() {
        return "Bus{" +
                "weight=" + weight +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberOfWheels=" + numberOfWheels +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}' + "\n";
    }
}
