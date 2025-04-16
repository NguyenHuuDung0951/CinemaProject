package test;

import collection.PaymentCollection;
import entity.Payment;

public class TestPaymentCollection {
    public static void main(String[] args) {
        PaymentCollection paymentCollection = new PaymentCollection();

        // Tạo các đối tượng Payment
        Payment p1 = new Payment("P001", "Chuyển khoản", true);
        Payment p2 = new Payment("P002", "Tiền mặt", false);
        Payment p3 = new Payment("P003", "Ví điện tử", true);

        // Thêm vào collection
        System.out.println("Thêm P001: " + paymentCollection.them(p1)); // true
        System.out.println("Thêm P002: " + paymentCollection.them(p2)); // true
        System.out.println("Thêm lại P001: " + paymentCollection.them(p1)); // false (bị trùng)

        // Xoá payment
        System.out.println("Xoá P002: " + paymentCollection.xoa("P002")); // true
        System.out.println("Xoá P005 (không tồn tại): " + paymentCollection.xoa("P005")); // false

        // Tìm kiếm payment
        System.out.println("Tìm P001: " + paymentCollection.tim("P001")); // Có
        System.out.println("Tìm P005: " + paymentCollection.tim("P005")); // Không có

        // In danh sách còn lại
        System.out.println("Danh sách Payment còn lại:");
        for (Payment p : paymentCollection.getdanhsachnhanvien()) {
            System.out.println(p);
        }
    }
}
