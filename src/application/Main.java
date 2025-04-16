package application;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel contentPanel;

    public Main() { 
        setTitle("CGV Cinema Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        Menu menuPanel = new Menu(this); 
        add(menuPanel, BorderLayout.WEST);

        contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.add(new JLabel("🎬 Chào mừng đến với CGV Cinema!", SwingConstants.CENTER), BorderLayout.CENTER);

        add(contentPanel, BorderLayout.CENTER); 
    }

    public void setContent(JComponent comp) {
        contentPanel.removeAll();
        contentPanel.add(comp, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint(); 
    }
}
