package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class Rectangle extends Polygon {

    protected double width;
    protected double height;
    
    public Rectangle(double x1, double y1, double x2, double y2, Color color) {
        super(color,color,5,Math.min(x1,x2),Math.min(y1, y2),4);
        this.x = Math.min(x1,x2);
        this.y = Math.min(y1, y2);
        this.height = Math.abs(y1-y2);
        this.width = Math.abs(x1-x2);
        this.ShapeType = Type.Rectangle;
        this.Start = new Point(intValue(x1), intValue(y1));
        this.End = new Point(intValue(x2), intValue(y2));
    }

    @Override
    public void Draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(color);
        g.setStroke(new BasicStroke((float) stThickness));
        
        if(isFill()){
            g.fill(new Rectangle2D.Double(x, y, width, height));
            g.setColor(Color.black);
            g.draw(new Rectangle2D.Double(x, y, width+stThickness/2, height+stThickness/2));
        }
        else
            g.draw(new Rectangle2D.Double(x, y, width, height));
        if(select){
            final float dash1[] = {10.0f};
            BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER, 10.0f, dash1, 0.0f);
            g.setColor(Color.CYAN);
            g.setStroke(dashed);
            g.draw(new Rectangle2D.Double(x-5, y-5, width+stThickness/2+10, height+stThickness/2+10));
        }
    }
    
    @Override
     public void resize(ResizeDirections direction , Point newPoint) 
    {

        switch(direction)
        {
            case right:
                this.width=Math.abs(newPoint.x - x);           
                break;
            case left:
                this.width=width+Math.abs(newPoint.x - x);
                x=newPoint.x;
                break;
            case up:
                this.height=height+Math.abs(y-newPoint.y);
                y=newPoint.y;
                break;
            case down:
                this.height=Math.abs(y-newPoint.y);
                break;                   
        }              
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean contains(Point2D Point) {
        Rectangle2D.Double aDouble = new Rectangle2D.Double(x, y, width, height);
        return aDouble.contains(Point);
    }
    
    @Override
    public Point getStart(){
        return this.Start;
    }
    
    @Override
    public Point getEnd(){
        return this.End;
    }
    
    @Override
    public java.awt.Shape getShape() {
        return new Rectangle2D.Double(x, y, width, height);
    } 
}
