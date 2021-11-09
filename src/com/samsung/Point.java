package com.samsung;

import java.awt.*;

public class Point implements Figure {
    public double x;
    public double y;
    public Color color;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point anotherPoint) {
        x = anotherPoint.x;
        y = anotherPoint.y;
    }

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.toString() +
                '}';
    }
    public double distanceXTo(Point anotherPoint) {
        return x - anotherPoint.x;
    }
    public double distanceYTo(Point anotherPoint) {
        return y - anotherPoint.y;
    }
    public double distanceTo(Point anotherPoint) {
        double dx = this.distanceXTo(anotherPoint);
        double dy = this.distanceYTo(anotherPoint);
        return Math.sqrt(dy * dy + dx * dx);
    }
}
