package com.company.Classes.impls.Jeep;

import com.company.Classes.impls.Mashine;

import java.io.Serializable;

/**
 * Created by Asus on 25.04.2017.
 */
public class Jeep extends Mashine implements Serializable
{
    private int weight;
    private int numberOfPassengers;
    private int numberOfWheels;

    public Jeep(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels) {
        super(name, speed);
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }

    public Jeep(String name, int speed, int weight, int numberOfPassengers) {
        super(name, speed);
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
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
        return "Jeep";
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "weight=" + weight +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberOfWheels=" + numberOfWheels +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}' + "\n";
    }
}
