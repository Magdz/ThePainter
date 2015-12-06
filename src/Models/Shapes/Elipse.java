package model.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Elipse extends Shape {
	
	protected double radius;

	public Elipse(Color color, double length, Color stColor,
			double stThickness, double x, double y, double radius) {
		super(color, length, stColor, stThickness, x, y);
		this.radius=radius;
		
		
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
	
	public double getRadius() {
		return radius;
	}
	
	
	
	

}
