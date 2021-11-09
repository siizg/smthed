package com.samsung;

import java.awt.*;

public class Square extends Rectangle implements Figure {
    public Point v;
    public double edge;
    public Color color;

    public Square(Point v, double edge) {
        super(v, edge, edge);
    }

    @Override
    public void move(double dx, double dy) {
        v.move(dx, dy);
    }
    @Override
    public String toString() {
        return "Square{" +
                "v=" + v +
                ", edge=" + edge +
                ", color=" + color.toString() +
                '}';
    }
}
