package com.samsung;

import java.awt.*;

public class Circle implements Figure {
    public Point center;
    public double radius;
    public Color color;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + color.toString() +
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }
    public double getDiameter() {
        return radius * 2;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public double getSurface() {
        return radius * Math.PI * radius;
    }
}
