package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;



public class Preferential extends JFrame{
	private JLabel lbtim;  
    private JTextField txttim;  
    private JButton btnThem, btnXoaRong, btnXoa, btnLuu, btnTim;  
    private DefaultTableModel model;  
    private JTable table;  

    // Column names for table  
    private String[] columnNames = {  
        "Mã Khuyến Mãi",   
        "Tên Khuyến Mãi",   
        "Ngày Bắt Đầu",   
        "Ngày Kết Thúc",   
        "Tổng Tiền Khuyến Mãi",   
        "Phần Trăm Khuyến Mãi"  
    };  

    public Preferential() {  
        // Frame configurations  
        setTitle("Quản Lý Nhân Viên");  
        setSize(800, 600);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);  

        JPanel pApp = new JPanel(new BorderLayout());  
        add(pApp);  

        // Header panel  
        JPanel pHeader = new JPanel(new BorderLayout());  
        pHeader.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));  

        JPanel pTitle = new JPanel(new FlowLayout(FlowLayout.CENTER));  
        JLabel lbtitle = new JLabel("Thông Tin Khuyến Mãi");  
        lbtitle.setFont(new Font("Arial", Font.BOLD, 20));  
        lbtitle.setForeground(Color.BLUE);  
        pTitle.add(lbtitle);  
        pHeader.add(pTitle, BorderLayout.NORTH);  
        pApp.add(pHeader, BorderLayout.NORTH);  

        // Table model and table  
        model = new DefaultTableModel(columnNames, 0);  
        table = new JTable(model);  
        JScrollPane sp = new JScrollPane(table);  
        pApp.add(sp, BorderLayout.CENTER);  

        // Footer panel for buttons and search  
        Box pfooter = new Box(BoxLayout.Y_AXIS);  
        pApp.add(pfooter, BorderLayout.SOUTH);  

        // Search section  
        Box b4 = new Box(BoxLayout.X_AXIS);  
        b4.setBorder(BorderFactory.createCompoundBorder(  
                BorderFactory.createLineBorder(Color.GRAY),  
                BorderFactory.createEmptyBorder(10, 10, 10, 10)  
        ));  
        lbtim = new JLabel("Nhập Thông Tin Khuyến Mãi:");  
        txttim = new JTextField(15); // Width of text field set to 15  
        btnTim = new JButton("Tìm");  
        b4.add(lbtim);  
        b4.add(Box.createHorizontalStrut(5));  
        b4.add(txttim);  
        b4.add(Box.createHorizontalStrut(5));  
        b4.add(btnTim);  
        pfooter.add(b4);  

        // Action buttons section  
        Box b5 = new Box(BoxLayout.X_AXIS);  
        b5.setBorder(BorderFactory.createCompoundBorder(  
                BorderFactory.createLineBorder(Color.GRAY),  
                BorderFactory.createEmptyBorder(10, 10, 10, 10)  
        ));  
        btnThem = new JButton("Thêm");  
        btnXoa = new JButton("Xóa");  
        btnXoaRong = new JButton("Xóa Trắng");  
        btnLuu = new JButton("Lưu");  
        b5.add(btnThem);  
        b5.add(Box.createHorizontalStrut(5));  
        b5.add(btnXoaRong);  
        b5.add(Box.createHorizontalStrut(5));  
        b5.add(btnXoa);  
        b5.add(Box.createHorizontalStrut(5));  
        b5.add(btnLuu);  
        pfooter.add(b5);  

        // Action listeners can be added here  
    }  

    public static void main(String[] args) {  
        SwingUtilities.invokeLater(() -> new Preferential().setVisible(true));  
    }  
}  
