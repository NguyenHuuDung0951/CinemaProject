package test;

import collection.SeatTypeCollection;
import entity.SeatType;

public class TestSeatTypeCollection {
    public static void main(String[] args) {
        SeatTypeCollection seatTypeCollection = new SeatTypeCollection();

        // Tạo các đối tượng SeatType
        SeatType s1 = new SeatType("S001", "Ghế Thường", "Ghế phổ thông, không có tiện nghi đặc biệt");
        SeatType s2 = new SeatType("S002", "Ghế VIP", "Ghế rộng rãi, có tựa đầu, dịch vụ tốt hơn");
        SeatType s3 = new SeatType("S003", "Ghế Đôi", "Ghế dành cho 2 người, không có tay vịn ở giữa");

        // Thêm vào danh sách
        System.out.println("Thêm S001: " + seatTypeCollection.them(s1)); // true
        System.out.println("Thêm S002: " + seatTypeCollection.them(s2)); // true
        System.out.println("Thêm lại S001: " + seatTypeCollection.them(s1)); // false

        // Xoá seat type
        System.out.println("Xoá S002: " + seatTypeCollection.xoa("S002")); // true
        System.out.println("Xoá không tồn tại S005: " + seatTypeCollection.xoa("S005")); // false

        // Tìm kiếm
        System.out.println("Tìm S001: " + seatTypeCollection.tim("S001")); // Có
        System.out.println("Tìm S005: " + seatTypeCollection.tim("S005")); // Không có

        // In danh sách còn lại
        System.out.println("Danh sách SeatType còn lại:");
        for (SeatType s : seatTypeCollection.getdanhsachnhanvien()) {
            System.out.println(s);
        }
    }
}
