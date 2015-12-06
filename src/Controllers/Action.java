/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Layer;
import java.util.LinkedList;
import models.shapes.Shape;

/**
 *
 * @author Ahmed
 * @param <Model>
 */
public abstract class Action<Model>{
    
    protected enum Type{
        Shape, Layer, Shapes;
    }
    
    protected Type TargetType;
    protected Model Target;
    
    public Action(Model Model){
        this.Target = Model;
        if(Model instanceof Shape)this.TargetType = Type.Shape;
        if(Model instanceof Layer)this.TargetType = Type.Layer;
        if(Model instanceof LinkedList)this.TargetType = Type.Shapes;
    }
    
}
