/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.LoginGUI.Background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.GroupLayout;

/**
 *
 * @author ACER
 */
public class PhoneGui2 extends javax.swing.JPanel {

    public PhoneGui2() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Bật khử răng cưa để đường viền mượt mà
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        // Định nghĩa màu sắc
        Color doNhat = new Color(209, 55, 55);
        Color doDam = new Color(128, 0, 0);

        // Vẽ hình chữ nhật bo tròn màu doNhatđậm (shadow/background)
        g2d.setColor(doDam);
        g2d.fillRoundRect(20,                                       // X: 20px từ trái
                getHeight()/14 + 10,                       // Y: ~7.1% + 10px từ trên
                getWidth() - getWidth()/14,                // Width: ~92.9% width
                getHeight() - getHeight()/10,              // Height: 90% height
                120, 120);                                // Bo góc 120px

        // Vẽ hình chữ nhật bo tròn màu doNhatnhạt (foreground)
        g2d.setColor(doNhat);
        g2d.fillRoundRect(getWidth()/14,                           // X: ~7.1% từ trái
                10,                                       // Y: 10px từ trên
                getWidth() - getWidth()/14,               // Width: ~92.9% width
                getHeight() - getHeight()/17,             // Height: ~94.1% height
                120, 120);                               // Bo góc 120px

        g2d.dispose();
        super.paintComponent(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Set layout manually
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
    }
}