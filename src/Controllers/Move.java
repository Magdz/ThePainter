/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Point;
import models.shapes.Shape;
import models.shapes.Shape.Type;

/**
 *
 * @author dinan
 */
public class Move {

    Canvas canvas;
    Shape shape;

    public Move(Canvas canvas, Shape shape, Point drawStart, Point drawEnd) {
        this.shape = shape;

        Point dispMoved = new Point(drawEnd.x - drawStart.x, drawEnd.y - drawStart.y);
        Point newShapeStart = new Point(shape.getStart().x + dispMoved.x, shape.getStart().y+ dispMoved.y);
        Point newShapeEnd = new Point(shape.getEnd().x + dispMoved.x,shape.getEnd().y + dispMoved.y);
        
        
        String shapeType = getType(shape);
        if (shape == null) return;
        canvas.delete(shape);
        Drawer drawer = new Drawer(canvas,shapeType, newShapeStart, newShapeEnd, shape.getColor());
    }
    private String getType(Shape shape)
    {
        Type type;
        type = shape.getShapeType();
        switch (type) {
            case Rectangle:
                return "Rectangle";
            case Square:
                return "Square";
            case Circle:
                return "Circle";
            case Elipse:
                return "Ellipse";
            case Triangle:
                return  "Triangle";
            case Line:
                return "Line";
        }
        return null;
    }

}
