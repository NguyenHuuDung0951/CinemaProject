package application;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;
    private final JProgressBar progressBar = new JProgressBar(0, 100);
    private Timer timer;
    private int count = 0;

    public SplashScreen() {
        
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);    
        setAlwaysOnTop(true);            
        
        JPanel content = new JPanel(null);
        content.setBackground(Color.WHITE);
        content.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setContentPane(content);

        JLabel lblLogo = new JLabel("CGV Cinema", SwingConstants.CENTER);
        lblLogo.setFont(new Font("Arial", Font.BOLD, 32));
        lblLogo.setBounds(0, 50, WIDTH, 40);
        content.add(lblLogo);

        progressBar.setBounds(50, 150, WIDTH - 100, 30);
        progressBar.setStringPainted(true);
        content.add(progressBar);

        JLabel lblLoading = new JLabel("Loading... 0%", SwingConstants.CENTER);
        lblLoading.setBounds(0, 190, WIDTH, 20);
        content.add(lblLoading);

       
        timer = new Timer(40, e -> {
            count++;
            progressBar.setValue(count);
            lblLoading.setText("Loading... " + count + "%");
            if (count >= 100) {
                timer.stop();
                dispose();              
                showLoginForm();         
            }
        });
    }

    public void start() { 
        setVisible(true);
        timer.start();
    }

    private void showLoginForm() {
        EventQueue.invokeLater(() -> {
            LoginForm login = new LoginForm();
            login.setLocationRelativeTo(null);  
            login.setVisible(true);
        });
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            new SplashScreen().start();
        });
    }
}
