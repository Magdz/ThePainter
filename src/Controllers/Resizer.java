/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Point;
import models.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public class Resizer extends Action{
    
    private Shape.ResizeDirections ResizeDirection;
    private final Point ResizeStart;
    private final Point ResizeEnd;
    
    public Resizer(Canvas canvas, Point ResizeStart, Point ResizeEnd){
        this.canvas = canvas;
        this.ResizeStart = ResizeStart;
        this.ResizeEnd = ResizeEnd;
        this.shape = this.canvas.getShape(this.ResizeStart);
        CalcDirection();
        Resize();
    }
    
    private void Resize(){
        if(shape  == null)return;
        shape.resize(this.ResizeDirection, ResizeEnd);
        canvas.repaint();
    }
    
    private void CalcDirection(){
        Point diff = new Point(ResizeEnd.x-ResizeStart.x,ResizeEnd.y-ResizeStart.y);
        double DirectionFlag = Math.max(Math.abs(diff.x), Math.abs(diff.y));
        if(DirectionFlag == Math.abs(diff.x)){
            if(diff.x > 0){
                ResizeDirection = Shape.ResizeDirections.right;
            }
            else{
                ResizeDirection = Shape.ResizeDirections.left;
            }
        }else if(DirectionFlag == Math.abs(diff.y)){
            if(diff.y > 0){
                ResizeDirection = Shape.ResizeDirections.down;
            }else{
                ResizeDirection = Shape.ResizeDirections.up;
            }
        }
        
    }

    @Override
    public void Reverse() {
        Deleter deleter = new Deleter(canvas,shape.getStart());
        deleter.forceDelete();
        Drawer drawer= new Drawer (canvas, shape.getShapeType().toString(), shape.getStart(), shape.getEnd(), shape.getColor());
        this.shape = drawer.getShape();
    }

    @Override
    public void Do() {
        Resize();
    }
}
