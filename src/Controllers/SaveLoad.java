/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Layers.Canvas;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JFileChooser;
import models.shapes.*;

/**
 *
 * @author Ahmed
 */
public class SaveLoad {
    
    private ArrayList<Shape> shapes;
    private Canvas canvas;
    
    public void Save(String Format,ArrayList shapes){
        this.shapes = shapes;
        try{
            if(Format.equalsIgnoreCase("xml"))encodeObjectToXML();
        }catch(Exception e){
            System.out.println("Saving Failed");
        }
    }
    
    public void Load(String Format,Canvas canvas){
        this.canvas = canvas;
        this.shapes = new ArrayList();
        try{
            if(Format.equalsIgnoreCase("xml"))decodeObjectFromXML();
        }catch(Exception e){
            System.out.println("Loading Failed");
        }
        this.canvas.setAllShapes(this.shapes);
        this.canvas.repaint();
    }
    
    private void encodeObjectToXML() throws FileNotFoundException{
        JFileChooser FileChooser = new JFileChooser();
        FileOutputStream fOutput = null;
        FileChooser.setCurrentDirectory(new File("/"));
        int retrival = FileChooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                fOutput = new FileOutputStream(FileChooser.getSelectedFile());
            } catch (Exception ex) {}
        }
        try (XMLEncoder XMLEncoder = new XMLEncoder(new BufferedOutputStream(fOutput))) {
            shapes.stream().forEach(new Consumer<Shape>() {
                @Override
                public void accept(Shape shape) {
                    XMLEncoder.writeObject(shape.getShape());
                    XMLEncoder.writeObject(shape.getColor());
                }
            });
        }
    }
    
    private void decodeObjectFromXML() throws FileNotFoundException{
        JFileChooser FileChooser = new JFileChooser();
        FileInputStream fInput = null;
        FileChooser.setCurrentDirectory(new File("/"));
        int retrival = FileChooser.showOpenDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                fInput = new FileInputStream(FileChooser.getSelectedFile());
            } catch (Exception ex) {}
        }
        try (XMLDecoder XMLDecoder = new XMLDecoder(new BufferedInputStream((fInput)))) {
            Object loaded = XMLDecoder.readObject();
            if(loaded instanceof Rectangle2D.Double){
                Rectangle2D.Double Rectangle = (Rectangle2D.Double) loaded;
                loaded = XMLDecoder.readObject();
                shapes.add(new Rectangle(Rectangle.x,Rectangle.y,Rectangle.x+Rectangle.width,Rectangle.y+Rectangle.height,(Color)loaded));
            }else if(loaded instanceof Ellipse2D.Double){
                Ellipse2D.Double Ellipse = (Ellipse2D.Double) loaded;
                loaded = XMLDecoder.readObject();
                shapes.add(new Elipse((Color)loaded, Color.yellow, 5, Ellipse.x, Ellipse.y, Ellipse.height, Ellipse.width));
            }
        }
    }
    
}
