/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Layers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;
import models.shapes.Shape;

/**
 *
 * @author Ahmed
 */
public class Canvas extends JPanel{
    
    private final LinkedList Layers;
    Point drawStart, drawEnd;
    ArrayList<Shape> shapes = new ArrayList<>();
    ArrayList<Color> shapeFill = new ArrayList<>();
    ArrayList<Color> shapeStroke = new ArrayList<>();
    
    public Canvas(){
        this.Layers = new LinkedList<>();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        Graphics2D g2d = (Graphics2D)g;
        shapes.stream().forEach((shape) -> {
            shape.Draw(g2d);
        });
    }  
    
    public void addShape(Shape Shape){
        shapes.add(Shape);
        repaint();
    }
    
    public Shape getShape(Point2D Point){
        for(Shape shape: shapes){
            if(shape.contains(Point)){
                return shape;
            }
        }
        return null;
    }
    
    public void delete(Shape shape){
        shapes.remove(shape);
        repaint();
    }
    
    public void unselectAll(){
        shapes.stream().forEach((shape) -> {
            shape.setSelected(false);
        });
        repaint();
    }
}
