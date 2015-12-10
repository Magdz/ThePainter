/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.util.LinkedList;

/**
 *
 * @author Ahmed
 */
public class Painter {
    
    private final Canvas Canvas;
    
    public Painter(){
        Canvas = new Canvas();
    }
    
    public Canvas getCanvas(){
        return this.Canvas;
    }
}
