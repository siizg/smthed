package com.samsung;

import java.awt.*;

public class Triangle implements Figure {
    public Point a;
    public Point b;
    public Point c;
    Color color;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color=" + color.toString() +
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        a.move(dx, dy);
        b.move(dx, dy);
        c.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    public double getSurface() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double p = (ab + bc + ac)/2;
        return Math.sqrt(p * (p - ac)* (p - ab) * (p - bc));
    }

    public double getPerimeter() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        return ac + ab + bc;
    }
    public boolean isIsoceles() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac == bc || ab == ac || ab == bc) return true;
        return false;
    }
    public boolean estEquilateral() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac == ab && ab == bc) return true;
        return false;
    }
    public boolean isRectangle() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac * ac == ab * ab + bc * bc ) return true;
        else if(ab * ab == ac * ac + bc * bc) return true;
        else if(bc * bc == ac * ac + ab * ab) return true;
        return false;
    }
}
