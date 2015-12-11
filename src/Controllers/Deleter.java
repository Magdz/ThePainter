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
public class Deleter extends Action{

    private static boolean DeleteFlag = false;
    
    public Deleter(Canvas canvas, Point Point) {
        Shape shape = canvas.getShape(Point);
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
    
}
