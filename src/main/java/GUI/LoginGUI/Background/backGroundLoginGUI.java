package GUI.LoginGUI.Background;

import javax.swing.*;
import java.awt.*;

public class backGroundLoginGUI extends JPanel {
    public backGroundLoginGUI() {
        initComponents();
        setPreferredSize(new Dimension(1093, 605));
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
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

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Color yellow = Color.decode("#fcdca9");
        Color red = new Color(128, 0, 0);
        int polyX[] = {0, getWidth()/2, getWidth()/2, 0};
        int polyY[] = {0, 0, getHeight(), getHeight()};
        int polyX2[] = {getWidth()/2, getWidth(), getWidth(), getWidth()/2};
        int polyY2[] = {0, 0, getHeight(), getHeight()};

        g2d.setColor(yellow);
        g2d.fillPolygon(polyX, polyY, 4);
        g2d.setColor(red);
        g2d.fillPolygon(polyX2, polyY2, 4);

        g2d.dispose();
        super.paintComponent(g);
    }


}
