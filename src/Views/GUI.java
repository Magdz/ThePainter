package Views;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dinan
 */
public class GUI extends javax.swing.JFrame {

    Canvas c = new Canvas();

    /**
     * Creates new form GUI
     */
    public GUI() {
        Theme();
        initComponents();
        
        c.setSize(400, 400);
        menubarPane.setVisible(false);
        shapesPane.setVisible(false);
        drawArea.setBackground(Color.white);
        drawArea.add(c);
        
        Container layerContainer = new Container();
        layerTabbed.add(layerContainer);
        layerContainer.setBackground(Color.white);
        
        LayerStyle layer = new LayerStyle(layerContainer);
        layer.addComp("Layer 1", layerContainer);
        
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

    public class Canvas extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponents(g);
            super.setOpaque(true);
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawRect(30, 30, 40, 40);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        drawArea = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
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
        tool_crop = new javax.swing.JButton();
        tool_shape = new javax.swing.JButton();
        shapesPane = new javax.swing.JLayeredPane();
        shape_oval = new javax.swing.JButton();
        shape_circle = new javax.swing.JButton();
        shape_rect = new javax.swing.JButton();
        shape_square = new javax.swing.JButton();
        shape_line = new javax.swing.JButton();
        shape_tri = new javax.swing.JButton();
        tool_undo = new javax.swing.JButton();
        tool_redo = new javax.swing.JButton();
        tool_resize = new javax.swing.JButton();
        tool_rotate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tool_eraser = new javax.swing.JButton();
        tool_stroke = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        layerTabbed = new javax.swing.JTabbedPane();
        jPopupMenu1.getAccessibleContext().setAccessibleName("");
        jPopupMenu1.getAccessibleContext().setAccessibleParent(Menu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jPanel2.setOpaque(false);

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        drawArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout drawAreaLayout = new javax.swing.GroupLayout(drawArea);
        drawArea.setLayout(drawAreaLayout);
        drawAreaLayout.setHorizontalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(817, Short.MAX_VALUE))
        );
        drawAreaLayout.setVerticalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Untitled 1", drawArea);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuMouseReleased(evt);
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
        tool_cursor.setContentAreaFilled(false);
        tool_cursor.setName("cursor"); // NOI18N
        tool_cursor.addMouseListener(new java.awt.event.MouseAdapter() {
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

        tool_paint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Paint Bucket Filled-15.png"))); // NOI18N
        tool_paint.setContentAreaFilled(false);
        tool_paint.addMouseListener(new java.awt.event.MouseAdapter() {
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

        tool_crop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Crop-15.png"))); // NOI18N
        tool_crop.setContentAreaFilled(false);
        tool_crop.addMouseListener(new java.awt.event.MouseAdapter() {
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

        shapesPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttons_entered(evt);
            }
        });

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

        shape_rect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Rectangle Filled-15.png"))); // NOI18N
        shape_rect.setContentAreaFilled(false);
        shape_rect.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addComponent(shape_tri, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(shape_tri))
                .addGap(0, 11, Short.MAX_VALUE))
        );

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

        tool_resize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Assets/Resize Four Directions.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tool_cursor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tool_pencil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tool_rotate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tool_resize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tool_redo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tool_undo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tool_shape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tool_brush, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tool_paint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tool_crop, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shapesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(tool_crop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tool_shape)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(tool_undo))
                            .addComponent(shapesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_redo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_resize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tool_rotate))
                    .addComponent(menubarPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layerTabbed))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(layerTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttons_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_entered
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.EnteredReleased(TargetButton);
    }//GEN-LAST:event_buttons_entered

    private void buttons_exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_exited
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.Exited(TargetButton);
    }//GEN-LAST:event_buttons_exited

    private void buttons_pressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttons_pressed
        JButton TargetButton = (JButton) evt.getSource();
        ButtonStyle Style = new ButtonStyle(TargetButton);
        Style.pressed(TargetButton);
    }//GEN-LAST:event_buttons_pressed

    private void MenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseReleased
        
    }//GEN-LAST:event_MenuMouseReleased

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited

    }//GEN-LAST:event_MenuMouseExited

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMousePressed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        if (menubarPane.isVisible() == true) {
            menubarPane.setVisible(false);
        } else {
            menubarPane.setVisible(true);
        }
    }//GEN-LAST:event_MenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JPanel drawArea;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane layerTabbed;
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
    private javax.swing.JButton tool_crop;
    private javax.swing.JButton tool_cursor;
    private javax.swing.JButton tool_eraser;
    private javax.swing.JButton tool_paint;
    private javax.swing.JButton tool_pencil;
    private javax.swing.JButton tool_redo;
    private javax.swing.JButton tool_resize;
    private javax.swing.JButton tool_rotate;
    private javax.swing.JButton tool_shape;
    private javax.swing.JButton tool_stroke;
    private javax.swing.JButton tool_undo;
    // End of variables declaration//GEN-END:variables
}
