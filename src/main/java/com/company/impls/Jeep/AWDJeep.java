package com.company.impls.Jeep;

/**
 * Created by Asus on 25.04.2017.
 */
public class AWDJeep extends Jeep
{

    boolean AWDController;

    public AWDJeep(String name, int speed, int weight, int numberOfPassengers, int numberOfWheels, boolean AWDController) {
        super(name, speed, weight, numberOfPassengers, numberOfWheels);
        this.AWDController = AWDController;
    }

    @Override
    public String showName() {
        return "AWD Jeep";
    }

    @Override
    public String toString() {
        return "AWDJeep{" +
                "AWDController=" + AWDController +
                "weight=" + super.getWeight() +
                ", numberOfPassengers=" + super.getNumberOfPassengers() +
                ", numberOfWheels=" + super.getNumberOfWheels() +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}';               }
}

