package GUI.LoginGUI.Component;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button() {
        setFont(new Font("Calibri", Font.PLAIN, 14));
        setBackground(new Color(200, 50, 50));
        setForeground(Color.black);
        this.setUI(new ButtonUI());
    }
}
