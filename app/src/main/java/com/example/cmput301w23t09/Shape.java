package com.example.cmput301w23t09;

public abstract class Shape {

    protected int x, y;
    String color = "blue";

    public Shape() {
        x = 0;
        y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
