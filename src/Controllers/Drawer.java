/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Color;
import java.awt.Point;
import models.shapes.*;

/**
 *
 * @author Ahmed
 */
public class Drawer extends Action {

    private final Canvas canvas;
    private final String ShapeType;
    private final Point drawStart;
    private final Point drawEnd;
    
    public Drawer(Canvas canvas, String ShapeType, Point drawStart, Point drawEnd) {
        this.canvas = canvas;
        this.ShapeType = ShapeType;
        this.drawStart = drawStart;
        this.drawEnd = drawEnd;
        Draw();
    }
    
    private void Draw(){
        switch (ShapeType) {
            case "Triangle":
                Triangle Triangle = new Triangle(Color.GRAY,Color.GRAY,5,drawStart.x,drawStart.y);
                int[] xPoints = new int[2];
                xPoints[0] = ((drawStart.x+drawEnd.x)/2)+50;
                xPoints[1] = drawEnd.x;
                int[] yPoints = new int[2];
                yPoints[0] = ((drawStart.y+drawEnd.y)/2)+50;
                yPoints[1] = drawEnd.y;
                Triangle.setPoints(xPoints, yPoints);
                canvas.addShape(Triangle);
                break;
            case "Rectangle":
                canvas.addShape(new Rectangle(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y,Color.BLACK));
                break;
            case "Square":
                canvas.addShape(new Square(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y, Color.YELLOW));
                break;
            case "Ellipse":
                canvas.addShape(new Elipse(Color.RED,Color.YELLOW,5,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs(drawStart.y-drawEnd.y), Math.abs((drawStart.x-drawEnd.x))));
                break;
            case "Circle":
                canvas.addShape(new Circle(Color.RED,Color.RED,1,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs((drawStart.x-drawEnd.x)/2)));
                break;
            case "Line":
                canvas.addShape(new Line(Color.CYAN,Color.CYAN,5,drawStart.x,drawEnd.x,drawStart.y,drawEnd.y));
                break;
        }
    }
    
}
