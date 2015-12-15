package models.shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.*;
import java.awt.BasicStroke;
import java.awt.Point;


public class Line extends Shape {
	
    private double x1;
    private double y1;


    public Line(Color color, Color stColor, double stThickness,
                    double x,double x1, double y, double y1) {
        super(color, stColor, stThickness, x, y);

        this.x1=x1;
        this.y1=y1;
        this.ShapeType = Type.Line;

    }

    @Override
    public void Draw(Graphics2D g) {

        //Specifying rendering quality 
         g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);	 
         g.setStroke(new BasicStroke((float) stThickness));
         g.setColor(color);
         g.draw(new Line2D.Double(x,y,x1,y1));
         if(select){
            final float dash1[] = {10.0f};
            BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
            g.setColor(Color.CYAN);
            g.setStroke(dashed);
            g.draw(new Rectangle2D.Double(x-5, y-5, Math.abs(x-x1), Math.abs(y-y1)));
        }
    }
    
    @Override
     public void resize(ResizeDirections direction , Point newPoint)  //right left only
    {
        switch(direction)
        {
            case right:
                x1=newPoint.x;          
                break;
            case left:
                x=newPoint.x;
                break;
        }
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

    @Override
    public boolean contains(Point2D Point) {
        Line2D.Double aDouble = new Line2D.Double(x, y, x1, y1);
        return aDouble.contains(Point);
    }

    @Override
    public Point getStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public java.awt.Shape getShape() {
        return new Line2D.Double(x, y, x1, y1);
    }
    
}
