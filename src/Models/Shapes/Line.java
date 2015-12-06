package models.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Line extends Shape {
	
	

	public Line(Color color, double length, Color stColor, double stThickness,
			double x, double y) {
		super(color, length, stColor, stThickness, x, y);
	}

	@Override
	public void Draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isSelected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

}
