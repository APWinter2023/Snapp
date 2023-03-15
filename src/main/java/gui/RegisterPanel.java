package gui;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class RegisterPanel extends JPanel {
    private int x = 0;
    private int y = 0;
    int xVelocity = 5;
    int yVelocity = 3;


    /**
     * A simple 2D_animation (moving ball).
     * You can change the direction by changing xVelocity and yVelocity.
     * Also, the speed can be changed by changing 'delay' or multiplying xVelocity and yVelocity in  a number.
    */

    public RegisterPanel() {
        this.setSize(SnappFrame.WIDTH, SnappFrame.HEIGHT);
        Color color = new Color(124, 204, 106);
        this.setBackground(color);
        this.setLayout(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.WHITE);
        g2D.fillOval(x, y, 30, 30);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (x >= 1000 - 30 || x < 0) {
                    xVelocity = xVelocity * -1;
                }
                x = x + xVelocity;
                if (y >= (800 - 60) || y < 0) {
                    yVelocity = yVelocity * -1;
                }
                y = y + yVelocity;
                repaint();
            }
        };
        Timer timer = new Timer();
        long delay = 5L;
        timer.schedule(task, delay);
    }
}
