/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed
 */
public class Canvas extends JPanel{
    
    private final LinkedList Layers;
    
    public Canvas(){
        this.Layers = new LinkedList<>();
    }
    
    
}
