package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public abstract class  Frame extends JFrame{
    public Frame (String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setLayout(null);
        setLocation(500, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new ColorUIResource(0x19527F));
    }


    @Override
    public void setVisible(boolean b){
        if (b == true){
            component();
            event();
        }
        super.setVisible(b);
    }

    protected abstract void component();
    protected abstract void event();

    protected void setBound(Component com, int x, int y, int width, int height){
        com.setBounds(x, y, width, height);
        add(com);
    }

    protected ImageIcon loadImage(String path, int width, int height){
        try {
            BufferedImage image;
            Image imgResize;
            ImageIcon imageIcon = null;
            image = ImageIO.read(new File(path));
            imgResize = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(imgResize);
            return imageIcon;
        } catch (Exception e) {
            return null;
        }
    }
}
