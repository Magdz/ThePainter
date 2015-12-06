/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.awt.Color;
import java.util.LinkedList;
import model.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public class Layer {
    
    private Color Background;
    private LinkedList<Shape> Shapes;
    
    public Layer(){
        this.Background = Color.WHITE;
        this.Shapes = new LinkedList<Shape>();
    }
    
    public void addShape(Shape Shape){
        this.Shapes.add(Shape);
    }
    
    public void removeShape(Shape Shape){
        this.Shapes.remove(Shape);
    }

    public Color getBackground() {
        return Background;
    }

    public void setBackground(Color Background) {
        this.Background = Background;
    }
    
}
