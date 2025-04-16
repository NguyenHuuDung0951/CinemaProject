package application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class LoginForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm frame = new LoginForm();
                 
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
        });
    }
 
    /**
     * Create the frame.
     */
    public LoginForm() {
        setTitle("CGV Cinema - Đăng nhập hệ thống");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(100, 100, 800, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Panel chính chứa form đăng nhập
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(255, 255, 255));
        mainPanel.setBounds(0, 0, 800, 500);
        contentPane.add(mainPanel);
        mainPanel.setLayout(null);
        
        // Panel bên trái (hình ảnh)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(58, 58, 58));
        leftPanel.setBounds(0, 0, 350, 500);
        mainPanel.add(leftPanel);
        leftPanel.setLayout(null);
        
        // Logo CGV
        JLabel lblLogo = new JLabel("CGV");
        lblLogo.setFont(new Font("Arial", Font.BOLD, 48));
        lblLogo.setForeground(new Color(255, 69, 0));
        lblLogo.setBounds(113, 153, 121, 74);
        leftPanel.add(lblLogo);
        
        // Slogan
        JLabel lblSlogan = new JLabel("CINEMA");
        lblSlogan.setForeground(Color.WHITE);
        lblSlogan.setFont(new Font("Arial", Font.PLAIN, 24));
        lblSlogan.setBounds(123, 218, 146, 29);
        leftPanel.add(lblSlogan);
        
        JLabel lblSubSlogan = new JLabel("Hệ thống quản lý rạp chiếu phim");
        lblSubSlogan.setForeground(new Color(200, 200, 200));
        lblSubSlogan.setFont(new Font("Arial", Font.PLAIN, 14));
        lblSubSlogan.setBounds(70, 260, 230, 20);
        leftPanel.add(lblSubSlogan);
         
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBounds(350, 0, 450, 500);
        mainPanel.add(rightPanel);
        rightPanel.setLayout(null);
        
        JLabel lblLogin = new JLabel("ĐĂNG NHẬP");
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
        lblLogin.setBounds(0, 90, 450, 40);
        rightPanel.add(lblLogin);
       
        JLabel lblUsername = new JLabel("Tên đăng nhập");
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 14));
        lblUsername.setBounds(80, 170, 290, 20);
        rightPanel.add(lblUsername);
 
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
        txtUsername.setBounds(80, 195, 290, 40);
        txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192)));
        rightPanel.add(txtUsername);
        txtUsername.setColumns(10);

        JLabel lblPassword = new JLabel("Mật khẩu");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblPassword.setBounds(80, 245, 290, 20);
        rightPanel.add(lblPassword); 

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        txtPassword.setBounds(80, 270, 290, 40);
        txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, new Color(192, 192, 192)));
        rightPanel.add(txtPassword);
        
        JButton btnLogin = new JButton("ĐĂNG NHẬP");
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(new Color(255, 69, 0));
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogin.setBounds(80, 340, 290, 40);
        btnLogin.setBorder(null);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                loginAction();
            }
        }); 
        rightPanel.add(btnLogin);

        JLabel lblForgotPassword = new JLabel("Quên mật khẩu?");
        lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblForgotPassword.setForeground(new Color(255, 69, 0));
        lblForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        lblForgotPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        lblForgotPassword.setBounds(240, 320, 130, 14);
        rightPanel.add(lblForgotPassword);
         

        JLabel lblFooter = new JLabel("© 2025 CGV Cinema.");
        lblFooter.setForeground(new Color(128, 128, 128));
        lblFooter.setHorizontalAlignment(SwingConstants.CENTER);
        lblFooter.setFont(new Font("Arial", Font.PLAIN, 12));
        lblFooter.setBounds(0, 440, 450, 14);
        rightPanel.add(lblFooter); 
 
        txtPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginAction();
            }
        });
    }
    

    private void loginAction() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
//        	sửa sau -> Lấy từ dbs xuống
        if (username.equals("admin") && password.equals("admin")) { 
            this.dispose();

            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        testGui mainFrame = new testGui();
                        mainFrame.setSize(1200, 700);
                        mainFrame.setLocationRelativeTo(null);
                        mainFrame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } else { 
            JOptionPane.showMessageDialog(this, 
                "Tên đăng nhập hoặc mật khẩu không chính xác!", 
                "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
            txtPassword.setText("");
            txtPassword.requestFocus();
        }
    }
}