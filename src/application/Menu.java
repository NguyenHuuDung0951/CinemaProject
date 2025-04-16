package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
    private JFrame parent;
    private JPanel qlSubMenu;
    private JButton btnQLPhim;

    public Menu(JFrame parentFrame) {
        this.parent = parentFrame;
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(250, getHeight()));
        setBackground(new Color(45, 45, 45));

        // Title
        JLabel titleLabel = new JLabel("CGV Cinema");
        titleLabel.setForeground(new Color(255, 128, 0));
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 0));
        add(titleLabel, BorderLayout.NORTH);
 
        // Menu items
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(45, 45, 45));
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(menuPanel);
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        // Buttons
        JButton btnPhim = createMenuButton("Phim");
        JButton btnSuatChieu = createMenuButton("Suất Chiếu");
        btnQLPhim = createMenuButton("Quản Lý Phim");
        JButton btnUuDai = createMenuButton("Ưu đãi");
        JButton btnSanPham = createMenuButton("Sản Phẩm/Combo");

        // Submenu for Quản Lý Phim
        qlSubMenu = new JPanel();
        qlSubMenu.setLayout(new BoxLayout(qlSubMenu, BoxLayout.Y_AXIS));
        qlSubMenu.setBackground(new Color(60, 60, 60));
        qlSubMenu.setVisible(false);
        String[] subItems = {"Thêm", "Xóa", "Sửa", "Cập Nhật"};
        for (String item : subItems) {
            JButton subBtn = createSubMenuButton(item);
            qlSubMenu.add(subBtn);
        }

        // Add to menuPanel
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

        // Logout at bottom
        JButton btnLogout = createMenuButton("Đăng Xuất");
        btnLogout.setBackground(new Color(100, 30, 30));
        JPanel pnlLogout = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlLogout.setBackground(new Color(45, 45, 45));
        pnlLogout.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        pnlLogout.add(btnLogout);
        add(pnlLogout, BorderLayout.SOUTH);

        // Action Listeners
        btnQLPhim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                qlSubMenu.setVisible(!qlSubMenu.isVisible());
                menuPanel.revalidate();
                menuPanel.repaint();
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (parent != null) {
                    parent.dispose();
                }
                EventQueue.invokeLater(() -> {
                    LoginForm loginForm = new LoginForm();
                    loginForm.setLocationRelativeTo(null);
                    loginForm.setVisible(true);
                });
            }
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
}
