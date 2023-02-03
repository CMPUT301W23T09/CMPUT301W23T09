package com.example.cmput301w23t09;

public abstract class Shape {

    protected int x, y;
<<<<<<< HEAD
    protected String color = "turquoise";
=======
    protected String color = "turquoise";
>>>>>>> 59ae7736af7005331c71b905063d3d72ff25caa4

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
