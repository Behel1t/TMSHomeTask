package org.hometask;

public class Rectangle extends Figure{
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimetr() {
        return 2*(side1+side2);
    }

    @Override
    public double square() {
        return side1*side2;
    }
}
