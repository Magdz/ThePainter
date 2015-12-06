package model.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Polygon extends Shape {
	
	protected int sides;	
	

	public Polygon(Color color, double length, Color stColor,
			double stThickness, double x, double y,int sides) {
		super(color, length, stColor, stThickness, x, y);
		this.sides=sides;
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
	
	public int getSides() {
		return sides;
	}
	
	

}
