package models.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Polygon extends Shape {
	
	protected int sides;
        private int[] xPoints;
        private int[] yPoints;
	

        // x y arrays takes x y points of the polygon
        //sides = array.length
	public Polygon(Color color, double length, Color stColor,
			double stThickness, double firstPointX, double firstPointY ,int sides) { // need to call setPoints to set x y points of the polygon
		super(color, length, stColor, stThickness,firstPointX,firstPointY);
		this.sides=sides;
               
	}

	@Override
	public void Draw(Graphics2D g) {
            
           g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           g.setColor(color);
           g.setStroke(new BasicStroke((float) stThickness));
           g.drawPolygon(xPoints,yPoints,sides);
		
	}
        
        public void setPoints(int[] xArr, int[] yArr)
        {
            xPoints[0]=(int)x;
            yPoints[0]=(int)y;
            for(int i=1; i< sides; i++)
            {
                xPoints[i]=xArr[i];
                yPoints[i]=yArr[i];
            }
        }
	
	public int getSides() {
		return sides;
	}
	
	

}
