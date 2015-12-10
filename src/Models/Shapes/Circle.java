package models.shapes;

import java.awt.Color;

public class Circle extends Elipse {

    public Circle(Color color, double length, Color stColor,
            double stThickness, double x, double y, double radius) {
        super(color, length, stColor, stThickness, x, y, 2*radius, 2*radius);

      }

}
