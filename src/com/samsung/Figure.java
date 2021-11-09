package com.samsung;

import java.awt.*;

public interface Figure {
    void move(double dx, double dy);

    String toString();

    void setColor(Color c);

}
