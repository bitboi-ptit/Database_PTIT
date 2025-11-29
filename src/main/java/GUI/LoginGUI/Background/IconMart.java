package GUI.LoginGUI.Background;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;

public class IconMart extends javax.swing.JPanel{
    static Image image;
    public IconMart() {
        initComponents();
        setOpaque(false);
    }

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

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        image = new ImageIcon(".\\src\\main\\java\\GUI\\SaleGroup\\LoginGui\\Image\\miniMart_resize.png").getImage();
        g2d.drawImage(image, 0, 0, this);
        g2d.dispose();
        super.paintComponents(g);
    }
}
