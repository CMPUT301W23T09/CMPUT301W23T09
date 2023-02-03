package com.example.cmput301w23t09;

public class Circle extends Shape {

    protected float radius;

    public Circle(float radius) {
        super();
        this.setRadius(radius);
    }

    public Circle(int x, int y, float radius) {
        super(x, y);
        this.setRadius(radius);
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Please specify a radius above 0.");
        }
        this.radius = radius;
    }

}
