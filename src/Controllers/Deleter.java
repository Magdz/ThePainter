/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import models.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public class Deleter extends Action{

    public Deleter(Object Model) {
        super(Model);
        if(super.TargetType == Type.Shape);
        if(super.TargetType == Type.Layer);
        if(super.TargetType == Type.Shapes);
    }
    
    private void deleteShape(){
        Shape Shape = (Shape)super.Target;
        Shape.getLayer().removeShape(Shape);
    }
    
}
