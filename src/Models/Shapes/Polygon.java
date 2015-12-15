package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

public class Polygon extends Shape {
	
    protected int sides;
    private final int[] xPoints;
    private final int[] yPoints;


    // x y arrays takes x y points of the polygon
    //sides = array.length
    public Polygon(Color color, Color stColor,
                    double stThickness, double firstPointX, double firstPointY ,int sides) { // need to call setPoints to set x y points of the polygon
        super(color, stColor, stThickness,firstPointX,firstPointY);
        this.sides=sides;
        xPoints = new int[sides];
        yPoints = new int[sides];
        this.ShapeType = Type.Polygon;
    }

    @Override
    public void Draw(Graphics2D g) {

       g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       g.setColor(color);
       g.setStroke(new BasicStroke((float) stThickness));
       if(isFill()){
           g.fillPolygon(xPoints,yPoints,sides);
           g.setColor(Color.YELLOW);
           g.drawPolygon(xPoints,yPoints,sides);
       }
       else
            g.drawPolygon(xPoints,yPoints,sides);

    }

    public void setPoints(int[] xArr, int[] yArr)
    {
        xPoints[0]=(int)x;
        yPoints[0]=(int)y;
        for(int i=1; i<sides; i++)
        {
            xPoints[i]=xArr[i-1];
            yPoints[i]=yArr[i-1];
        }
    }

    public int getSides() {
            return sides;
    }

    @Override
    public boolean contains(Point2D Point) {
        return false;
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
    public void resize(ResizeDirections direction, Point newPoint) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public java.awt.Shape getShape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
