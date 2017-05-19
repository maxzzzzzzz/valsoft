package com.company.Classes.impls.Bus;

import com.company.Classes.impls.Mashine;

import java.io.Serializable;

/**
 * Created by Asus on 27.04.2017.
 */
public class Bus extends Mashine implements Serializable
{
    private Integer weight;
    private Integer numberOfPassengers;
    private Integer numberOfWheels;
    private Integer id;

    public Bus(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels) {
        super(name, speed);
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }

    public Bus() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
