package com.example.cmput301w23t09;

public class Rhombus extends Shape {

    private int sideLength;

    public Rhombus(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) throws IllegalArgumentException {
        if (sideLength < 0)
            throw new IllegalArgumentException("Side length must be > 0");
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return 4*sideLength;
    }

}
