package com.company.Classes.impls.Bus;

/**
 * Created by Asus on 27.04.2017.
 */
public class CityBus extends Bus
{
    private int numberOfPlaces;

    public CityBus(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels, int numberOfPlaces) {
        super(name, speed, weight, numberOfPassengers, numberOfWheels);
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public String toString() {
        return "CityBus{" +
                "numberOfPlaces=" + numberOfPlaces +
                "weight=" + super.getWeight() +
                ", numberOfPassengers=" + super.getNumberOfPassengers() +
                ", numberOfWheels=" + super.getNumberOfWheels() +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}' + "\n";
    }

    @Override
    public String showName() {
        return "CityBus";
    }
}
