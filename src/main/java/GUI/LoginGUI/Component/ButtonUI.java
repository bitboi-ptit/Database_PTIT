package GUI.LoginGUI.Component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;

public class ButtonUI extends BasicButtonUI {
    public ButtonUI() {
        super();
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setOpaque(false);
        button.setBorder(new EmptyBorder(5, 15, 5, 15));
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        paintBackgound(g, button, button.getModel().isPressed() ? 2 : 0);
        super.paint(g, c);
    }

    private void paintBackgound(Graphics g, JComponent c, int yOffset) {
        Dimension size = c.getSize();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(c.getBackground());
        g2d.fillRoundRect(0, yOffset, size.width - 1, size.height - 1, 30, 30);
    }
}
