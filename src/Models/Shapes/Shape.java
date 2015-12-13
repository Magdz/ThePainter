package models.shapes;

import Models.Layers.Layer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;

public abstract class Shape {
    
    public enum Type{
        Rectangle,Square,Circle,Elipse,Triangle,Polygon,Line;
    }
    
    public enum ResizeDirections{
        up,down,left,right
    }
    
    protected Type ShapeType;
    protected Point Start;
    protected Point End;

    protected Color color;
   // protected double length;
    protected Color stColor;
    protected double stThickness;
   // protected double border;
    protected boolean select = false;
    protected boolean fill = true;

    protected double x;
    protected double y;

    protected Layer Layer;

    public Shape(Color color, Color stColor, double stThickness,
            double x, double y) {
        this.color = color;
      //  this.length = length;
        this.stColor = stColor;
        this.stThickness = stThickness;
        this.x = x;
        this.y = y;
    }

    public abstract void Draw(Graphics2D g);
    public abstract void resize(ResizeDirections direction, Point newPoint);
    
    public Type getShapeType(){
        return this.ShapeType;
    }

    public void setSelected(boolean selected) {
        this.select = selected;
    }

    public Boolean getSelected() {
        return select;
    }

    public Color getColor() {
        return color;
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

    public Layer getLayer() {
        return this.Layer;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStColor(Color stColor) {
        this.stColor = stColor;
    }

    public void setStThickness(double stThickness) {
        this.stThickness = stThickness;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLayer(Layer layer) {
        Layer = layer;
    }
   

    public Boolean isSelected() {
        Boolean selected = false;
        if (getSelected()) {
            selected = true;
        } else {
            selected = false;
        }

        return selected;

    }

    public void select() {
        setSelected(true);
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    
    public abstract boolean contains(Point2D Point);
    public abstract Point getStart();
    public abstract Point getEnd();
    
}
