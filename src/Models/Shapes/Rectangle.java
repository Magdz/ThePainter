package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Polygon {

    protected double width;
    protected double height;
    
    private double x;
    private double y;
    
    public Rectangle(double x1, double y1, double x2, double y2, Color color) {
        super(color,color,5,Math.min(x1,x2),Math.min(y1, y2),4);
        this.x = Math.min(x1,x2);
        this.y = Math.min(y1, y2);
        this.height = Math.abs(y1-y2);
        this.width = Math.abs(x1-x2);
    }

    @Override
    public void Draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(color);
        g.setStroke(new BasicStroke((float) stThickness));
        
        if(isFill()){
            g.fill(new Rectangle2D.Double(x, y, width, height));
            g.setColor(Color.blue);
            g.draw(new Rectangle2D.Double(x, y, width+stThickness/2, height+stThickness/2));
        }
        else
            g.draw(new Rectangle2D.Double(x, y, width, height));
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

}
