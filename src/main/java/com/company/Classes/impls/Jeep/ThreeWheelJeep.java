package com.company.Classes.impls.Jeep;

/**
 * Created by Asus on 25.04.2017.
 */
public class ThreeWheelJeep extends Jeep
{
    public ThreeWheelJeep(String name, int speed, int weight, int numberOfPassengers) {
        super(name, speed, weight, numberOfPassengers);
        super.setNumberOfWheels(3);
    }

    @Override
    public String showName() {
        return "ThreeWheelJeep";
    }

    @Override
    public String toString()
    {
        return "ThreeWheelJeep{" +
                "weight=" + super.getWeight() +
                ", numberOfPassengers=" + super.getNumberOfPassengers() +
                ", numberOfWheels=" + super.getNumberOfWheels() +
                ", name='" + super.getName() + '\'' +
                ", speed=" + super.getSpeed() +
                '}' + "\n";
    }
}
