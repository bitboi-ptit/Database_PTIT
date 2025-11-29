package GUI.LoginGUI.Background;

import org.imgscalr.Scalr;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel extends JPanel {
    private ImageIcon image;

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(this.image != null){
            Graphics2D g2d = (Graphics2D) g.create();
            // Thiết lập chất lượng render cao
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            BufferedImage imageBuffer = getImgBuffer(this.image);
            // Resize ảnh vừa với chiều rộng panel
            BufferedImage buff = Scalr.resize(imageBuffer,getWidth());


            g2d.drawImage(buff, 0, 0, this);
            g2d.dispose();
        }
    }

    private BufferedImage getImgBuffer(ImageIcon image){
        BufferedImage imageBuffer = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imageBuffer.createGraphics();
        image.paintIcon(this, g2d, 0, 0);
        g2d.dispose();
        return imageBuffer;
    }
}
