package org.tms.lessons;

public enum Position {
    DIRECTOR(2.0),
    WORKER(1.0);
    private double coefficient;

    Position(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
