/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author dinan
 */
public class ButtonStyle {

    JButton button = new JButton();
    
    public ButtonStyle(JButton button)
    {
        this.button = button;
        button.setContentAreaFilled(false);
        button.setOpaque(true);
    }
    public void EnteredReleased(JButton button) {
        
        button.setBackground(new Color(222, 232, 238));
    }
    public void Exited(JButton button) {
        button.setBackground(new Color(247, 247, 247));
    }
    public void pressed(JButton button){
        button.setBackground(new Color(185, 210, 226));
    }
    
}
