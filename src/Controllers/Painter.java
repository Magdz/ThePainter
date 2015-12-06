/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Layer;
import java.util.LinkedList;

/**
 *
 * @author Ahmed
 */
public class Painter {
    
    private final LinkedList<Layer> Layers;
    
    public Painter(){
        Layers = new LinkedList<>();
    }
    
    public LinkedList getLayers(){
        return this.Layers;
    }
}
