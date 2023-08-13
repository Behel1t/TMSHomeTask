package org.example.tms;

import java.util.Objects;

public class Car {
    private String colour;
    private int weight;
    private int speed;

    public Car(String colour, int weight, int speed) {
        this.colour = colour;
        this.weight = weight;
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && speed == car.speed && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, weight, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
