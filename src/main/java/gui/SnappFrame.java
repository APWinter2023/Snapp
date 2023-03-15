package gui;
import gui.images.ImageAddress;
import javax.swing.*;
import java.awt.*;

public class SnappFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;


    public SnappFrame() {
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setTitle("Snapp!");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(ImageAddress.SNAPP_ICON).getImage());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(new LoginPanel());
        this.setVisible(true);
    }
}