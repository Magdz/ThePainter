package models.shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Line2D.Float;
import java.awt.*;
import java.awt.BasicStroke;

import javax.swing.JApplet;

import com.sun.javafx.geom.Point2D;

public class Line extends Shape {
	
	private double x1;
	private double y1;

	

	public Line(Color color, Color stColor, double stThickness,
			double x,double x1, double y, double y1) {
		super(color, stColor, stThickness, x, y);
		
		this.x1=x1;
		this.y1=y1;
		
	}

	@Override
	public void Draw(Graphics2D g) {
		
		//Specifying rendering quality 
		 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);	 
		 g.setStroke(new BasicStroke((float) stThickness));
		 g.setColor(color);
                 g.draw(new Line2D.Double(x,x1,y,y1));

		 
	}

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
        
        

	
	
	
	
	
	
	
	

}
