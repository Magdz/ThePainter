/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author dinan
 */
public final class ColorChooser extends JColorChooser{

    AbstractColorChooserPanel[] panels = this.getChooserPanels();
    
    public ColorChooser()
    {
        setColorChooser();
    }
    public void setColorChooser()
    {
        for(AbstractColorChooserPanel p : panels)
        {
            String name = p.getDisplayName();
            switch(name)
            {
                case "HSV":
                    this.removeChooserPanel(p);
                    break;
                case "HSL":
                    this.removeChooserPanel(p);
                    break;
                case "CMYK":
                    this.removeChooserPanel(p);
                    break;
            }
        }
       this.setPreviewPanel(new JPanel());
    
    }

}
