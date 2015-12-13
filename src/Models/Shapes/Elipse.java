package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class Elipse extends Shape {

    // protected double radius;
    protected double height;
    protected double width;

    public Elipse(Color color, Color stColor,
            double stThickness, double x, double y, double height, double width) {
        super(color,stColor, stThickness, x, y);
        //   this.radius = radius;
        this.height = height;
        this.width = width;
        this.Start = new Point(intValue(x), intValue(y));
        this.End = new Point(intValue(x+width), intValue(y+height));
    }

    @Override
    public void Draw(Graphics2D g) {
        
        //BasicStroke stroke= new BasicStroke()
       // Border lineborder = BorderFactory.createLineBorder(color,(int)stThickness);

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke basicStroke = new BasicStroke((float) stThickness);
        g.setStroke(basicStroke);
        g.setColor(color);
        
        if(isFill()){
            g.fill(new Ellipse2D.Double(x, y, width, height));
            g.setColor(Color.YELLOW);
            g.draw(new Ellipse2D.Double(x, y, width+stThickness/2, height+stThickness/2));
        }
        else
            g.draw(new Ellipse2D.Double(x, y, width, height));
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
        Ellipse2D.Double aDouble = new Ellipse2D.Double(x, y, width, height);
        return aDouble.contains(Point);
    }

    @Override
    public Point getStart() {
        return this.Start;
    }

    @Override
    public Point getEnd() {
        return this.End;
    }

}
