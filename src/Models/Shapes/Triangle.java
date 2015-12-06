package models.shapes;

import java.awt.Color;

public class Triangle extends Polygon {

	public Triangle(Color color, double length, Color stColor,
			double stThickness, double x, double y) {
		super(color, length, stColor, stThickness, x, y,3 );
	}

}
