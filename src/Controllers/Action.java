/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import models.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public abstract class Action{
    
    protected Canvas canvas;
    protected Shape shape;
    
    public abstract void Reverse();
    public abstract void Do();
    
}
