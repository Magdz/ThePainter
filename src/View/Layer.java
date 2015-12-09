/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dinan
 */
public class Layer extends JPanel {

    final private JPanel container = new JPanel();
    final private JLabel label = new JLabel();
    
    //Needs testing
   /* protected void paintComponent(Shape s, Graphics2D g2d) {
        super.paintComponent(g2d);
        g2d.draw(s);
    }
    */
    public void setContainer(String text, JPanel panel){
        this.label.setText(text);
        container.add(label);
        panel.add(container);
        container.setSize(230,30);
        label.setSize(220,20);
        container.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.lightGray));
        
    }
}
