package models.shapes;

import java.awt.Color;

public class Square extends Rectangle {
	
    private final double length;

    public Square(double x1, double y1, double x2 , double y2, Color color) {
            super(x1, y1, x2, y2, color); //length=width
            length = Math.max(super.width,super.height);
            super.width = super.height = length;
    }
    
}
