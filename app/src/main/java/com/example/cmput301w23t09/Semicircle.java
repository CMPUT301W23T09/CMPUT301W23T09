package com.example.cmput301w23t09;

public class Semicircle extends Shape {
    private int radius;

    public Semicircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

}
