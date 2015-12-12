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
    private final Color Color;
    
    public Drawer(Canvas canvas, String ShapeType, Point drawStart, Point drawEnd,Color Color) {
        this.canvas = canvas;
        this.ShapeType = ShapeType;
        this.drawStart = drawStart;
        this.drawEnd = drawEnd;
        this.Color = Color;
        Draw();
    }
    
    private void Draw(){
        switch (ShapeType) {
            case "Triangle":
                Triangle Triangle = new Triangle(Color,Color,5,drawStart.x,drawStart.y);
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
                canvas.addShape(new Rectangle(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y,Color));
                break;
            case "Square":
                canvas.addShape(new Square(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y, Color));
                break;
            case "Ellipse":
                canvas.addShape(new Elipse(Color,Color,5,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs(drawStart.y-drawEnd.y), Math.abs((drawStart.x-drawEnd.x))));
                break;
            case "Circle":
                canvas.addShape(new Circle(Color,Color,1,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs((drawStart.x-drawEnd.x)/2)));
                break;
            case "Line":
                canvas.addShape(new Line(Color,Color,5,drawStart.x,drawEnd.x,drawStart.y,drawEnd.y));
                break;
        }
    }

    
    @Override
    public void Reverse() {
        try{
            Point Center = new Point((drawStart.x+drawEnd.x)/2,(drawStart.y+drawEnd.y)/2);
            Deleter deleter = new Deleter(this.canvas,Center);
            deleter.forceDelete();
        }catch(Exception e){
            
        }
    }

    @Override
    public void Do() {
        Draw();
    }
    
}
