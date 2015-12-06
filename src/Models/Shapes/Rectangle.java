package models.shapes;

import java.awt.Color;

public class Rectangle extends Polygon {
	
	private double width;

	public Rectangle(Color color, double length, Color stColor,
			double stThickness, double x, double y, double width) {
		super(color, length, stColor, stThickness, x, y, 4); 
		
		this.width=width;
	}
	
	public double getWidth() {
		return width;
	}

}
