/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import Views.GUI;

/**
 *
 * @author Ahmed
 */
public class Painter {
    
    private GUI GUI;
    private final Canvas Canvas;
    
    public Painter(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI = new GUI();
                GUI.setVisible(true);
            }
        });
        Canvas = new Canvas();
    }
    
    public Canvas getCanvas(){
        return this.Canvas;
    }
}
