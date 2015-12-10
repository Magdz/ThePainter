/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import javax.swing.JPanel;
import models.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public class Layer extends JPanel implements MouseListener{
    
    private Color Background;
    private final LinkedList<Shape> Shapes;
    
    public Layer(){
        this.Background = Color.WHITE;
        this.Shapes = new LinkedList<>();
        this.addMouseListener(this);
    }
    
    public void addShape(Shape Shape){
        this.Shapes.add(Shape);
    }
    
    public void removeShape(Shape Shape){
        this.Shapes.remove(Shape);
    }

    @Override
    public Color getBackground() {
        return Background;
    }

    @Override
    public void setBackground(Color Background) {
        this.Background = Background;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
