package org.example.tms;

import java.util.Objects;

public class Plane {
    private String colour;
    private int weight;
    private int speed;

    public Plane(String colour, int weight, int speed) {
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
        Plane plane = (Plane) o;
        return weight == plane.weight && speed == plane.speed && Objects.equals(colour, plane.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, weight, speed);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
