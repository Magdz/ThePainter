/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Point;

/**
 *
 * @author Ahmed
 */
public final class Deleter extends Action{

    private static boolean DeleteFlag = false;
    
    public Deleter(Canvas canvas, Point Point) {
        this.canvas = canvas;
        this.shape = canvas.getShape(Point);
        Delete();
    }
    
    public void Delete(){
        if(DeleteFlag){
            if(shape.isSelected()){
                canvas.delete(shape);
            }
            DeleteFlag = false;
        }else{
            canvas.unselectAll();
            if(shape == null){
                DeleteFlag = false;
                return;
            }
            shape.select();
            DeleteFlag = true;
        }
    }
    
    public void forceDelete(){
        canvas.delete(shape);
    }
    
    public boolean getFlag(){
        return this.DeleteFlag;
    }

    @Override
    public void Reverse() {
        Drawer drawer = new Drawer(canvas,shape.getShapeType().toString(), shape.getStart(), shape.getEnd(), shape.getColor());
        canvas.addShape(shape);
    }

    @Override
    public void Do() {
        canvas.delete(shape);
    }
    
}
