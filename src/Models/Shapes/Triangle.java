package models.shapes;

import java.awt.Color;

public class Triangle extends Polygon {

	public Triangle(Color color, double length, Color stColor,
			double stThickness, int firstPointx, int firstPointy) { //need to call setPoints for x y points
		super(color, length, stColor, stThickness, firstPointx, firstPointy,3 );
                            
	}

}
