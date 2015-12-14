/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Ahmed
 */
public class Filler extends Action{
    
    private Color newColor;
    private Color oldColor;
    
    public Filler(Canvas canvas,Point Point,Color newColor){
        this.canvas = canvas;
        this.newColor = newColor;
        this.shape = this.canvas.getShape(Point);
        Fill();
    }
    
    private void Fill(){
        if(shape == null)return;
        this.oldColor = shape.getColor();
        shape.setColor(newColor);
        canvas.repaint();
    }

    @Override
    public void Reverse() {
        this.newColor = this.oldColor;
        Fill();
    }

    @Override
    public void Do() {
        this.newColor = this.oldColor;
        Fill();
    }
    
}
