package gui;
import gui.images.ImageAddress;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel {
    private JLabel loginText;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel panel;
    private final Color color;
    private JLabel registerLabel;
    private JLabel headText;

    public LoginPanel() {
        this.setSize(SnappFrame.WIDTH, SnappFrame.HEIGHT);
        color = new Color(124, 204, 106);
        this.setBackground(color);
        this.setLayout(null);
        init();
        addListener();
        add();
    }

    private void init() {
        headText = new JLabel("IN THE NAME OF GOD");
        headText.setBackground(Color.GREEN);
        headText.setBounds(370, 100, 250, 50);
        headText.setFont(new Font(null, Font.BOLD, 20));
        headText.setHorizontalAlignment(SwingConstants.CENTER);
        headText.setOpaque(true);

        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2D = (Graphics2D) g;
                Image image = new ImageIcon(ImageAddress.LOGIN_IMAGE).getImage();
                g2D.drawImage(image, 0, 50, 300, 300, null);

                g.setColor(Color.BLACK);
                g.drawLine(330, 280, 570, 280);
            }
        };
        panel.setBounds(200, 150, 600, 400);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        loginText = new JLabel("Login");
        loginText.setFont(new Font(null, Font.BOLD, 40));
        loginText.setBounds(375, 15, 200, 100);
        loginText.setForeground(color);

        usernameLabel = new JLabel("username:");
        usernameLabel.setBounds(325, 120, 75, 20);

        passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(325, 170, 75, 20);

        usernameField = new JTextField();
        usernameField.setBackground(color);
        usernameField.setBounds(400, 120, 125, 20);
        usernameField.setToolTipText("Enter username");

        passwordField = new JPasswordField();
        passwordField.setBounds(400, 170, 125, 20);
        passwordField.setBackground(color);
        passwordField.setToolTipText("Enter password");
        passwordField.setEchoChar('*');

        loginButton = new JButton();
        loginButton.setText("login");
        loginButton.setBackground(color);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBounds(400, 220, 80, 30);
        loginButton.setFocusable(false);

        registerLabel = new JLabel("New Here? Create An Account.");
        registerLabel.setForeground(color);
        registerLabel.setFont(new Font(null, Font.ITALIC, 15));
        registerLabel.setBounds(330, 290, 240, 50);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void add() {
        panel.add(loginText);
        panel.add(usernameLabel);
        panel.add(passwordLabel);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerLabel);

        this.add(headText);
        this.add(panel);
    }

    private void addListener() {
        usernameField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    passwordField.requestFocus();
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    loginButton.doClick();
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello " + usernameField.getText());
            }
        });

        registerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((SnappFrame) SwingUtilities.getWindowAncestor
                        (LoginPanel.this)).setContentPane
                        (new RegisterPanel());
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        Color color = new Color(185, 235, 174);

        g2D.setColor(color);
        g2D.fillOval(-50, 500, 300, 300);

        g2D.setColor(this.color);
        g2D.fillOval(-20, 550, 220, 200);

        g2D.setColor(color);
        g2D.fillOval(40, 600, 100, 100);

        int[] x = new int[] {700, 800, SnappFrame.WIDTH, SnappFrame.WIDTH};
        int[] y = new int[] {0, 0, 200, 300};
        g2D.fillPolygon(x, y, 4);

        x = new int[] {850, 900, SnappFrame.WIDTH, SnappFrame.WIDTH};
        y = new int[] {0, 0, 100, 150};
        g2D.fillPolygon(x, y, 4);
    }
}

