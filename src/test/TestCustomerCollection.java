package test;

import java.time.LocalDate;

import collection.CustommerCollection; // chú ý tên viết đúng với class bạn tạo
import entity.Customer;

public class TestCustomerCollection {
    public static void main(String[] args) {
        CustommerCollection customerCollection = new CustommerCollection();

        // Tạo khách hàng
        Customer c1 = new Customer("C001", "Nguyễn Văn A", "0123456789", "a@gmail.com", LocalDate.of(2023, 5, 10));
        Customer c2 = new Customer("C002", "Trần Thị B", "0987654321", "b@gmail.com", LocalDate.of(2024, 3, 1));
        Customer c3 = new Customer("C003", "Lê Văn C", "0909090909", "c@gmail.com", LocalDate.of(2025, 1, 20));

        // Thêm khách hàng
        System.out.println("Thêm C001: " + customerCollection.them(c1)); // true
        System.out.println("Thêm C002: " + customerCollection.them(c2)); // true
        System.out.println("Thêm C001 lại: " + customerCollection.them(c1)); // false (bị trùng)

        // Xoá khách hàng
        System.out.println("Xoá C002: " + customerCollection.xoa("C002")); // true
        System.out.println("Xoá C005 (không có): " + customerCollection.xoa("C005")); // false

        // Tìm kiếm
        System.out.println("Tìm C001: " + customerCollection.tim("C001"));
        System.out.println("Tìm C005: " + customerCollection.tim("C005"));

        // Hiển thị danh sách còn lại
        System.out.println("Danh sách khách hàng còn lại:");
        for (Customer c : customerCollection.getdanhsachnhanvien()) {
            System.out.println(c);
        }
    }
}
