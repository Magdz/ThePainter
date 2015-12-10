/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Shape;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author dinan
 */
public class LayerStyle extends JPanel {

    private JPanel panel = new JPanel();
    
    private Container container = new Container();

    public LayerStyle(Container container) {
        this.container = container;
    }
    
    public void addComp ()
    {
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));

        addLabel("Layer1",container);
        addLabel("Layer2",container);

    }
    
    private void addLabel(String text, Container container) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText(text);
        panel.add(label);

        panel.setBorder(BorderFactory.createLoweredBevelBorder());
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE,panel.getMinimumSize().height));

        container.add(panel);
    }
    
    //Needs testing

    /* protected void paintComponent(Shape s, Graphics2D g2d) {
        super.paintComponent(g2d);
        g2d.draw(s);
    }
     */
}
