package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Elipse extends Shape {

    // protected double radius;
    protected double height;
    protected double width;

    public Elipse(Color color, double length, Color stColor,
            double stThickness, double x, double y, double height, double width) {
        super(color, length, stColor, stThickness, x, y);
        //   this.radius = radius;
        this.height = height;
        this.width = width;

    }

    @Override
    public void Draw(Graphics2D g) {
        
        //BasicStroke stroke= new BasicStroke()
       // Border lineborder = BorderFactory.createLineBorder(color,(int)stThickness);

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setStroke(new BasicStroke((float) stThickness));
        g.setColor(color);
        g.draw(new Ellipse2D.Double(x, y, width, height));

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
