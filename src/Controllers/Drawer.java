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
        this.shape = null;
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
                this.shape = Triangle;
                canvas.addShape(Triangle);
                break;
            case "Rectangle":
                Rectangle Rectangle = new Rectangle(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y,Color);
                this.shape = Rectangle;
                canvas.addShape(Rectangle);
                break;
            case "Square":
                Square Square = new Square(drawStart.x,drawStart.y,drawEnd.x,drawEnd.y, Color);
                this.shape = Square;
                canvas.addShape(Square);
                break;
            case "Ellipse":
                Elipse Ellipse =new Elipse(Color,Color,5,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs(drawStart.y-drawEnd.y), Math.abs((drawStart.x-drawEnd.x))); 
                this.shape = Ellipse;
                canvas.addShape(Ellipse);
                break;
            case "Circle":
                Circle Circle = new Circle(Color,Color,1,Math.min(drawStart.x, drawEnd.x),Math.min(drawStart.y, drawEnd.y), Math.abs((drawStart.x-drawEnd.x)/2));
                this.shape = Circle;
                canvas.addShape(Circle);
                break;
            case "Line":
                Line Line = new Line(Color,Color,5,drawStart.x,drawEnd.x,drawStart.y,drawEnd.y);
                this.shape = Line;
                canvas.addShape(Line);
                break;
        }
    }
    
    
    public Shape getShape(){
        return shape;
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
