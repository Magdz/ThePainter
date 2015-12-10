/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed
 */
public class Canvas extends JPanel implements MouseListener{
    
    private final LinkedList Layers;
    private Graphics g2d;
    
    public Canvas(){
        this.Layers = new LinkedList<>();
        this.addMouseListener(this);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        super.setOpaque(true);
        this.g2d = g;
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Hi Click");
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    public void mouseDraged(MouseEvent me){
    }
    
    public void add(Layer Layer){
        this.Layers.add(Layer);
    }
}
