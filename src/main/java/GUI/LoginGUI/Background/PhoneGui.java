package GUI.LoginGUI.Background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.GroupLayout;

/**
 *
 * @author ACER
 */
public class PhoneGui extends javax.swing.JPanel {

    public PhoneGui() {
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
        Color trang = Color.decode("#FFFFFF");    // Màu trắng

        g2d.setColor(doNhat);
        g2d.fillRoundRect(0, 0,
                getWidth() - getWidth()/50,   // Chiều rộng (lùi vào 2%)
                getHeight() - getHeight()/50, // Chiều cao (lùi vào 2%)
                80, 80);                     // Bo góc 80px

        // Vẽ hình chữ nhật bo tròn màu trắng (foreground)
        g2d.setColor(trang);
        g2d.fillRoundRect(getWidth() / 15,          // Lùi sang phải ~6.7%
                0,
                getWidth() - getWidth()/15, // Chiều rộng
                getHeight() - getHeight()/25, // Chiều cao (lùi vào 4%)
                80, 80);                   // Bo góc 80px

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