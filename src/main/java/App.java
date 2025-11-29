import com.formdev.flatlaf.FlatLightLaf;

import GUI.LoginGUI.LoginFrame.LoginGui;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new LoginGui();
    }
}
