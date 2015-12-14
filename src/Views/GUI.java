package Views;

import Controllers.*;
import Models.Layers.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import models.shapes.*;

/**
 *
 * @author dinan
 */
public class GUI extends javax.swing.JFrame {

    Canvas canvas;
    ColorChooser colorchooser;
    Point drawStart, drawEnd;
    String TargetTool = null;
    String TargetShape = null;
    Color CurrentColor = Color.BLACK;
    UndoRedo UndoRedo;

    /**
     * Creates new form GUI
     */
    public GUI() {
        Theme();
        initComponents();

        colorPanel.setVisible(false);
        menubarPane.setVisible(false);
        shapesPane.setVisible(false);
        canvas = new Canvas();
        canvas.setSize(drawArea.getSize());
        drawArea.add(canvas);

//        Container layerContainer = new Container();
        //      layerContainer.setName("Layers");
        //    layerTabbed.add(layerContainer);
        //  layerContainer.setBackground(Color.white);
        //LayerStyle layer = new LayerStyle(layerContainer);
        //layer.addComp("Layer 1", layerContainer);
        colorchooser = new ColorChooser();
        colorchooser.setSize(colorPanel.getSize());
        colorPanel.add(colorchooser);

        UndoRedo = new UndoRedo();
    }

    private void Theme() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                try {
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        canvasTabbedPanel = new javax.swing.JTabbedPane();
        drawArea = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        shapesPane = new javax.swing.JLayeredPane();
        shape_oval = new javax.swing.JButton();
        shape_circle = new javax.swing.JButton();
        shape_rect = new javax.swing.JButton();
        shape_square = new javax.swing.JButton();
        shape_line = new javax.swing.JButton();
        shape_tri = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();
        menubarPane = new javax.swing.JLayeredPane();
        menu_new = new javax.swing.JButton();
        menu_save = new javax.swing.JButton();
        menu_import = new javax.swing.JButton();
        menu_export = new javax.swing.JButton();
        tool_cursor = new javax.swing.JButton();
        tool_pencil = new javax.swing.JButton();
        tool_brush = new javax.swing.JButton();
        tool_paint = new javax.swing.JButton();
        tool_shape = new javax.swing.JButton();
        tool_undo = new javax.swing.JButton();
        tool_redo = new javax.swing.JButton();
        tool_move = new javax.swing.JButton();
        tool_rotate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tool_eraser = new javax.swing.JButton();
        tool_stroke = new javax.swing.JButton();
        tool_resize = new javax.swing.JButton();
        jPopupMenu1.getAccessibleContext().setAccessibleName("");
        jPopupMenu1.getAccessibleContext().setAccessibleParent(Menu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Painter v1.0");
        setFocusable(false);

        jPanel2.setOpaque(false);

        canvasTabbedPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        canvasTabbedPanel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        drawArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drawArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawAreaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawAreaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        shapesPane.setOpaque(true);

        shape_oval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Ellipse-15 (1).png"))); // NOI18N
        shape_oval.setContentAreaFilled(false);
        shape_oval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        shape_oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape_ovalActionPerformed(evt);
            }
        });

        shape_circle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Circled Thin-15.png"))); // NOI18N
        shape_circle.setContentAreaFilled(false);
        shape_circle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        shape_circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape_circleActionPerformed(evt);
            }
        });

        shape_rect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Rectangle Filled-15.png"))); // NOI18N
        shape_rect.setContentAreaFilled(false);
        shape_rect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shape_rectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        shape_square.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Full Image-15.png"))); // NOI18N
        shape_square.setToolTipText("");
        shape_square.setContentAreaFilled(false);
        shape_square.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        shape_square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape_squareActionPerformed(evt);
            }
        });

        shape_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Horizontal Line Filled-15.png"))); // NOI18N
        shape_line.setContentAreaFilled(false);
        shape_line.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        shape_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape_lineActionPerformed(evt);
            }
        });

        shape_tri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Triangle-15.png"))); // NOI18N
        shape_tri.setContentAreaFilled(false);
        shape_tri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        shape_tri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape_triActionPerformed(evt);
            }
        });

        shapesPane.setLayer(shape_oval, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shapesPane.setLayer(shape_circle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shapesPane.setLayer(shape_rect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shapesPane.setLayer(shape_square, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shapesPane.setLayer(shape_line, javax.swing.JLayeredPane.DEFAULT_LAYER);
        shapesPane.setLayer(shape_tri, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout shapesPaneLayout = new javax.swing.GroupLayout(shapesPane);
        shapesPane.setLayout(shapesPaneLayout);
        shapesPaneLayout.setHorizontalGroup(
            shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapesPaneLayout.createSequentialGroup()
                .addGroup(shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shapesPaneLayout.createSequentialGroup()
                        .addComponent(shape_oval, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shape_circle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shape_rect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shapesPaneLayout.createSequentialGroup()
                        .addComponent(shape_square, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shape_line, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shape_tri, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shapesPaneLayout.setVerticalGroup(
            shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapesPaneLayout.createSequentialGroup()
                .addGroup(shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shape_oval)
                    .addComponent(shape_circle)
                    .addComponent(shape_rect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shapesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shape_square)
                        .addComponent(shape_line))
                    .addComponent(shape_tri)))
        );

        javax.swing.GroupLayout drawAreaLayout = new javax.swing.GroupLayout(drawArea);
        drawArea.setLayout(drawAreaLayout);
        drawAreaLayout.setHorizontalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawAreaLayout.createSequentialGroup()
                .addComponent(shapesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        drawAreaLayout.setVerticalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawAreaLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(drawAreaLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(shapesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        canvasTabbedPanel.addTab("Untitled 1", drawArea);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        Menu.setBackground(new java.awt.Color(247, 247, 247));
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Menu-26.png"))); // NOI18N
        Menu.setBorderPainted(false);
        Menu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Menu.setFocusPainted(false);
        Menu.setFocusable(false);
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        menu_new.setBackground(new java.awt.Color(247, 247, 247));
        menu_new.setText("New Canvas");
        menu_new.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_new.setBorderPainted(false);
        menu_new.setContentAreaFilled(false);
        menu_new.setFocusable(false);
        menu_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        menu_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_newActionPerformed(evt);
            }
        });

        menu_save.setBackground(new java.awt.Color(247, 247, 247));
        menu_save.setText("Save");
        menu_save.setBorder(null);
        menu_save.setContentAreaFilled(false);
        menu_save.setFocusable(false);
        menu_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        menu_import.setText("Import");
        menu_import.setContentAreaFilled(false);
        menu_import.setFocusable(false);
        menu_import.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        menu_export.setText("Export");
        menu_export.setContentAreaFilled(false);
        menu_export.setFocusable(false);
        menu_export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        menubarPane.setLayer(menu_new, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menubarPane.setLayer(menu_save, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menubarPane.setLayer(menu_import, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menubarPane.setLayer(menu_export, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menubarPaneLayout = new javax.swing.GroupLayout(menubarPane);
        menubarPane.setLayout(menubarPaneLayout);
        menubarPaneLayout.setHorizontalGroup(
            menubarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_import, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
            .addComponent(menu_export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menubarPaneLayout.setVerticalGroup(
            menubarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarPaneLayout.createSequentialGroup()
                .addComponent(menu_new, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(menu_import, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_export, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        tool_cursor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Cursor-15.png"))); // NOI18N
        tool_cursor.setToolTipText("Select");
        tool_cursor.setContentAreaFilled(false);
        tool_cursor.setName("cursor"); // NOI18N
        tool_cursor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tool_cursorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_pencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Pencil-15 (1).png"))); // NOI18N
        tool_pencil.setToolTipText("Draw");
        tool_pencil.setContentAreaFilled(false);
        tool_pencil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_brush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Paint Brush Filled-15.png"))); // NOI18N
        tool_brush.setContentAreaFilled(false);
        tool_brush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        tool_brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_brushActionPerformed(evt);
            }
        });

        tool_paint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Paint Bucket Filled-15.png"))); // NOI18N
        tool_paint.setContentAreaFilled(false);
        tool_paint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tool_paintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_shape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Trigonometry-15.png"))); // NOI18N
        tool_shape.setToolTipText("");
        tool_shape.setContentAreaFilled(false);
        tool_shape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tool_shapeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Undo.png"))); // NOI18N
        tool_undo.setContentAreaFilled(false);
        tool_undo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        tool_undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_undoActionPerformed(evt);
            }
        });

        tool_redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Redo.png"))); // NOI18N
        tool_redo.setContentAreaFilled(false);
        tool_redo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        tool_redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_redoActionPerformed(evt);
            }
        });

        tool_move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Resize Four Directions.png"))); // NOI18N
        tool_move.setContentAreaFilled(false);
        tool_move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tool_moveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_rotate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Rotate.png"))); // NOI18N
        tool_rotate.setContentAreaFilled(false);
        tool_rotate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_eraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Eraser-10.png"))); // NOI18N
        tool_eraser.setContentAreaFilled(false);
        tool_eraser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        tool_eraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_eraserActionPerformed(evt);
            }
        });

        tool_stroke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Pencil Sharpener-10.png"))); // NOI18N
        tool_stroke.setContentAreaFilled(false);
        tool_stroke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

        tool_resize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Crop-15.png"))); // NOI18N
        tool_resize.setContentAreaFilled(false);
        tool_resize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttons_exited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttons_pressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });
        tool_resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_resizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tool_cursor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_pencil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_rotate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_move, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_redo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_undo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tool_shape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tool_brush, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tool_paint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addComponent(tool_resize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tool_stroke, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(tool_eraser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menubarPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Menu)
                        .addGap(45, 45, 45)
                        .addComponent(tool_cursor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tool_pencil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_eraser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tool_stroke)
                        .addGap(10, 10, 10)
                        .addComponent(tool_brush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tool_paint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tool_shape)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(tool_undo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_redo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_move)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_rotate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tool_resize))
                    .addComponent(menubarPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvasTabbedPanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawAreaMousePressed
        shapesPane.setVisible(false);
        colorPanel.setVisible(false);
        menubarPane.setVisible(false);
        drawStart = drawArea.getMousePosition();
    }//GEN-LAST:event_drawAreaMousePressed

    private void drawAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawAreaMouseReleased

        drawEnd = drawArea.getMousePosition();

        if (TargetTool == "Drawing" && TargetShape != null) {
            CurrentColor = colorchooser.getColor();
            if (drawStart.x == drawEnd.x && drawStart.y == drawEnd.y) {
                return;
            }
            Drawer drawer = new Drawer(canvas, TargetShape, drawStart, drawEnd, CurrentColor);
            this.UndoRedo.addUndo(drawer);
        } else if (TargetTool == "Selecting") {
            canvas.unselectAll();
            Shape shape = canvas.getShape(drawStart);
            if (shape == null) {
                return;
            }
            shape.select();
            repaint();
        } else if (TargetTool == "Deleting") {
            Deleter deleter = new Deleter(canvas, drawStart);
            if (deleter.getFlag()) {
                this.UndoRedo.addUndo(deleter);
            }
        } else if (TargetTool == "Filling") {
            Filler filler = new Filler(canvas, drawStart, colorchooser.getColor());
            this.UndoRedo.addUndo(filler);
        } else if (TargetTool == "Resizing") {
            Resizer resizer = new Resizer(canvas, drawStart, drawEnd);
            this.UndoRedo.addUndo(resizer);
        } else if (TargetTool == "Moving") {
            Shape shape = canvas.getShape(drawStart);
            Move moving = new Move(canvas, drawStart, drawEnd);
            this.UndoRedo.addUndo(moving);
        }
    }//GEN-LAST:event_drawAreaMouseReleased

    private void buttons_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_entered
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.EnteredReleased(TargetButton);
    }//GEN-LAST:event_buttons_entered

    private void buttons_pressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_pressed
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.pressed(TargetButton);
    }//GEN-LAST:event_buttons_pressed

    private void buttons_exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_exited
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.Exited(TargetButton);
    }//GEN-LAST:event_buttons_exited

    private void shape_triActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape_triActionPerformed
        TargetShape = "Triangle";
    }//GEN-LAST:event_shape_triActionPerformed

    private void shape_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape_lineActionPerformed
        TargetShape = "Line";
    }//GEN-LAST:event_shape_lineActionPerformed

    private void shape_squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape_squareActionPerformed
        TargetShape = "Square";
    }//GEN-LAST:event_shape_squareActionPerformed

    private void shape_rectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape_rectMouseClicked
        TargetShape = "Rectangle";
    }//GEN-LAST:event_shape_rectMouseClicked

    private void shape_circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape_circleActionPerformed
        TargetShape = "Circle";
    }//GEN-LAST:event_shape_circleActionPerformed

    private void shape_ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape_ovalActionPerformed
        TargetShape = "Ellipse";
    }//GEN-LAST:event_shape_ovalActionPerformed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        if (menubarPane.isVisible() == true) {
            menubarPane.setVisible(false);
        } else {
            menubarPane.setVisible(true);
            shapesPane.setVisible(false);
            colorPanel.setVisible(false);

        }
    }//GEN-LAST:event_MenuMouseClicked

    private void tool_paintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tool_paintMouseClicked
        if (colorPanel.isVisible() == true) {
            colorPanel.setVisible(false);
        } else {
            colorPanel.setVisible(true);
            shapesPane.setVisible(false);
            menubarPane.setVisible(false);

        }
    }//GEN-LAST:event_tool_paintMouseClicked

    private void tool_shapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tool_shapeMouseClicked
        TargetTool = "Drawing";
        if (shapesPane.isVisible() == true) {
            shapesPane.setVisible(false);
        } else {
            shapesPane.setVisible(true);
            menubarPane.setVisible(false);
            colorPanel.setVisible(false);
        }
    }//GEN-LAST:event_tool_shapeMouseClicked

    private void tool_cursorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tool_cursorMouseClicked
        TargetTool = "Selecting";
    }//GEN-LAST:event_tool_cursorMouseClicked

    private void tool_eraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_eraserActionPerformed
        TargetTool = "Deleting";
    }//GEN-LAST:event_tool_eraserActionPerformed

    private void tool_undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_undoActionPerformed
        this.UndoRedo.Undo();
    }//GEN-LAST:event_tool_undoActionPerformed

    private void tool_redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_redoActionPerformed
        this.UndoRedo.Redo();
    }//GEN-LAST:event_tool_redoActionPerformed

    private void tool_brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_brushActionPerformed
        TargetTool = "Filling";
    }//GEN-LAST:event_tool_brushActionPerformed

    private void tool_resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_resizeActionPerformed
        TargetTool = "Resizing";
    }//GEN-LAST:event_tool_resizeActionPerformed

    private void tool_moveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tool_moveMouseClicked
        TargetTool = "Moving";        // TODO add your handling code here:
    }//GEN-LAST:event_tool_moveMouseClicked

    private void menu_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_newActionPerformed
        Canvas canvas2 = new Canvas();
        canvas2.setSize(drawArea.getSize());
        canvas2.setVisible(true);
        canvasTabbedPanel.addTab("Untitled" + (canvasTabbedPanel.getTabCount()+1), canvas2);
        canvasTabbedPanel.setSelectedIndex(canvasTabbedPanel.getTabCount() - 1);
        menubarPane.setVisible(false);

    }//GEN-LAST:event_menu_newActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JTabbedPane canvasTabbedPanel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JPanel drawArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menu_export;
    private javax.swing.JButton menu_import;
    private javax.swing.JButton menu_new;
    private javax.swing.JButton menu_save;
    private javax.swing.JLayeredPane menubarPane;
    private javax.swing.JButton shape_circle;
    private javax.swing.JButton shape_line;
    private javax.swing.JButton shape_oval;
    private javax.swing.JButton shape_rect;
    private javax.swing.JButton shape_square;
    private javax.swing.JButton shape_tri;
    private javax.swing.JLayeredPane shapesPane;
    private javax.swing.JButton tool_brush;
    private javax.swing.JButton tool_cursor;
    private javax.swing.JButton tool_eraser;
    private javax.swing.JButton tool_move;
    private javax.swing.JButton tool_paint;
    private javax.swing.JButton tool_pencil;
    private javax.swing.JButton tool_redo;
    private javax.swing.JButton tool_resize;
    private javax.swing.JButton tool_rotate;
    private javax.swing.JButton tool_shape;
    private javax.swing.JButton tool_stroke;
    private javax.swing.JButton tool_undo;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {

    }
}
