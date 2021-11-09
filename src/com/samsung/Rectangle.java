package com.samsung;

import java.awt.*;

public class Rectangle implements Figure {
    public Point v;
    public double edgeX;
    public double edgeY;
    public Color color;
    public Rectangle(Point v, double edgeX, double edgeY) {
        this.v = v;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "v=" + v +
                ", edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                ", color=" + color.toString()+
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        v.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }
    public double getSurface() {
        return edgeX * edgeY;
    }
    public double getPerimeter() {
        return (edgeX + edgeY) * 2;
    }
}
