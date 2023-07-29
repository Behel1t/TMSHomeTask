package org.hometask;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double square() {
        return  Math.sqrt(semiPerimetr()*(semiPerimetr()-side1)*(semiPerimetr()-side2)*(semiPerimetr()-side3));
    }

    @Override
    public double perimetr() {
        return  side1 + side2 + side3;
    }


    public double semiPerimetr() {
        return  1 / 2 * (side1 + side2 + side3);
    }
}
