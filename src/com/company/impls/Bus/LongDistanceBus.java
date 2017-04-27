package com.company.impls.Bus;

/**
 * Created by Asus on 27.04.2017.
 */
public class LongDistanceBus extends Bus
{
    private int numberOfDeckers;

    public LongDistanceBus(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels) {
        super(name, speed, weight, numberOfPassengers, numberOfWheels);
        this.numberOfDeckers = 2;
    }

    public int getNumberOfDeckers() {
        return numberOfDeckers;
    }

    public void setNumberOfDeckers(int numberOfDeckers) {
        this.numberOfDeckers = numberOfDeckers;
    }

    @Override
    public String toString() {
        return "LongDistanceBus{" +
                "weight=" + super.getWeight() +
                ", numberOfPassengers=" + super.getNumberOfPassengers() +
                ", numberOfWheels=" + super.getNumberOfWheels() +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}';
    }

    @Override
    public String showName() {
        return "LongDistanceBus";
    }
}
