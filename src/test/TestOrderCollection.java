package test;

import java.time.LocalDate;

import collection.OrderCollection;
import entity.Order;
import entity.Customer;
import entity.Employee;

public class TestOrderCollection {
    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();

        // Tạo customer và employee để gắn vào đơn hàng
        Customer customer = new Customer("C001", "Nguyễn Văn A", "0901234567", "a@gmail.com", LocalDate.of(2023, 3, 15));
        Employee employee = new Employee("E001", "Trần Thị B", false, LocalDate.of(1990, 4, 10), "0912345678", "b@gmail.com", 5000);

        // Tạo đơn hàng
        Order o1 = new Order("O001", LocalDate.of(2024, 12, 1), 1000000, customer, employee);
        Order o2 = new Order("O002", LocalDate.of(2024, 12, 2), 2000000, customer, employee);

        // Thêm đơn hàng
        System.out.println("Thêm O001: " + orderCollection.them(o1)); // true
        System.out.println("Thêm O002: " + orderCollection.them(o2)); // true
        System.out.println("Thêm lại O001: " + orderCollection.them(o1)); // false (trùng)

        // Xoá đơn hàng
        System.out.println("Xoá O002: " + orderCollection.xoa("O002")); // true
        System.out.println("Xoá không tồn tại O005: " + orderCollection.xoa("O005")); // false

        // Tìm đơn hàng
        System.out.println("Tìm O001: " + orderCollection.tim("O001"));
        System.out.println("Tìm O005: " + orderCollection.tim("O005"));

        // Hiển thị danh sách đơn hàng còn lại
        System.out.println("Danh sách đơn hàng còn lại:");
        for (Order o : orderCollection.getdanhsachnhanvien()) {
            System.out.println(o);
        }
    }
}
