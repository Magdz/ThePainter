package models.shapes;

import Models.Layers.Layer;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape {

    protected Color color;
   // protected double length;
    protected Color stColor;
    protected double stThickness;
   // protected double border;
    protected boolean select;
    protected boolean fill;

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
        Boolean selected= false;
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
    
    

}
