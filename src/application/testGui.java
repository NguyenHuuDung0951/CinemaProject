package application;

import javax.swing.*;
import java.awt.*;

public class testGui extends JFrame {
    private JPanel qlSubMenu;
    private JButton btnQLPhim;

    public testGui() {
        setTitle("FlatLaf Menu Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        setLocationRelativeTo(null);
        setSize(1200, 700);
        initUI();
    }

    private void initUI() {
        getContentPane().setLayout(new BorderLayout()); 
        JPanel sidePanel = new JPanel();
        sidePanel.setPreferredSize(new Dimension(250, -1));
        sidePanel.setBackground(new Color(45, 45, 45));
        sidePanel.setLayout(new BorderLayout());
        getContentPane().add(sidePanel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel("CGV Cinema");
        titleLabel.setForeground(new Color(255, 128, 0));
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 0));
        sidePanel.add(titleLabel, BorderLayout.NORTH);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(45, 45, 45));
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(menuPanel);
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sidePanel.add(scrollPane, BorderLayout.CENTER);

        JButton btnPhim = createMenuButton("Phim");
   
        JButton btnSuatChieu = createMenuButton("Suất Chiếu");

        btnQLPhim = createMenuButton("Quản Lý Phim");

        qlSubMenu = new JPanel();
        qlSubMenu.setLayout(new BoxLayout(qlSubMenu, BoxLayout.Y_AXIS));
        qlSubMenu.setBackground(new Color(60, 60, 60));
        qlSubMenu.setVisible(false);

        String[] subItems = {"Thêm", "Xóa", "Sửa", "Cập Nhật"};
        for (String item : subItems) {
            JButton subBtn = createSubMenuButton(item);
            qlSubMenu.add(subBtn);
        }

        JButton btnUuDai = createMenuButton("Ưu đãi");
        JButton btnSanPham = createMenuButton("Sản Phẩm/Combo");

        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnPhim);
        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnSuatChieu);
        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnQLPhim);
        menuPanel.add(qlSubMenu);
        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnUuDai);
        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnSanPham);
        menuPanel.add(Box.createVerticalGlue());

       
        
        
        JPanel pnlLogout = new JPanel(); 
        pnlLogout.setBackground(new Color(45, 45, 45));
        JButton btnLogout = createMenuButton("Đăng Xuất");
        btnLogout.setBackground(new Color(100, 30, 30));
        pnlLogout.add(btnLogout);
        menuPanel.add(pnlLogout);
        pnlLogout.setLayout(null);
        
        JButton btnNewButton = new JButton("Đăng Xuất");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(255, 85, 85));
        btnNewButton.setBounds(77, 179, 85, 21);
        pnlLogout.add(btnNewButton);

//        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
//        bottomPanel.setBackground(new Color(45, 45, 45));
////        bottomPanel.add(btnLogout);
//        sidePanel.add(bottomPanel, BorderLayout.SOUTH);

        // === Action Listeners ===
        btnQLPhim.addActionListener(e -> {
            qlSubMenu.setVisible(!qlSubMenu.isVisible());
            menuPanel.revalidate();
            menuPanel.repaint();
        });

        btnLogout.addActionListener(e -> {
            dispose();
            new LoginForm().setVisible(true);
        }); 
    }

    private JButton createMenuButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        button.setBackground(new Color(60, 60, 60));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        return button;
    }

    private JButton createSubMenuButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setBackground(new Color(80, 80, 80));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 10));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new testGui().setVisible(true);
        });
    }
}
