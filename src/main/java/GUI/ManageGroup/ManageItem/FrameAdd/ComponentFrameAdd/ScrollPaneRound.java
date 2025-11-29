package GUI.ManageGroup.ManageItem.FrameAdd.ComponentFrameAdd;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JScrollPane;

public class ScrollPaneRound  extends JScrollPane{

    public ScrollPaneRound() {
         this.setOpaque(false);
    }
    
    
    {
        setOpaque(false);
    }
           protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
      
       g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 80, 80);
        g2d.dispose();
        super.paintComponent(g);
        
   
   
    
    }
}
