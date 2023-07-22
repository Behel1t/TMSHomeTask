package org.hometask;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2*3.14*radius;
    }

    @Override
    public double square() {
        return  radius*3.14*radius;
    }
}
