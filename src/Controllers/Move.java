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
public class Move extends Action{

    private final Canvas canvas;
    private Shape shape;
    private String shapeType;
    private final Point MoveStart;
    private final Point MoveEnd;
    private Point oldStart;
    private Point oldEnd;

    public Move(Canvas canvas, Point MoveStart, Point MoveEnd) {
        this.canvas = canvas;
        this.MoveStart = MoveStart;
        this.MoveEnd = MoveEnd;
        this.shape = canvas.getShape(MoveStart);
        Move();
    }
    
    private void Move(){
        Point dispMoved = new Point(MoveEnd.x - MoveStart.x, MoveEnd.y - MoveStart.y);
        Point newShapeStart = new Point(shape.getStart().x + dispMoved.x, shape.getStart().y+ dispMoved.y);
        Point newShapeEnd = new Point(shape.getEnd().x + dispMoved.x,shape.getEnd().y + dispMoved.y);
        
        if (shape == null) return;
        this.shapeType = getType(shape);
        this.oldStart = shape.getStart();
        this.oldEnd = shape.getEnd();
        canvas.delete(shape);
        Drawer drawer = new Drawer(canvas, shapeType, newShapeStart, newShapeEnd, shape.getColor());
        this.shape = drawer.getShape();
        this.canvas.repaint();
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

    @Override
    public void Reverse() {
        canvas.delete(shape);
        Drawer drawer = new Drawer(canvas, shapeType, oldStart, oldEnd, shape.getColor());
        this.shape = drawer.getShape();
    }

    @Override
    public void Do() {
        Move();
    }

}
