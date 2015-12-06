package model.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape {
	
	protected Color color;
	protected double length;
	protected Color stColor;
	protected double stThickness;
	
	protected double x;
	protected double y;
	
	
	
	public Shape(Color color, double length, Color stColor, double stThickness,
			double x, double y) {
		this.color = color;
		this.length = length;
		this.stColor = stColor;
		this.stThickness = stThickness;
		this.x = x;
		this.y = y;
	}
	
	
	public abstract void Draw (Graphics2D g);
	public abstract Boolean isSelected();
	public abstract void setBorder();
	public abstract void setColor();


	public Color getColor() {
		return color;
	}


	public double getLength() {
		return length;
	}


	public Color getStColor() {
		return stColor;
	}


	public double getStThickness() {
		return stThickness;
	}


	public double getX() {
		return x;
	}


	public double getY() {
		return y;
	}
	
	
	
	
	
	
	
	

}
