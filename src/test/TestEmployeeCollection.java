package test;

import java.time.LocalDate;
import collection.EmployeeCollection;
import entity.Employee;

public class TestEmployeeCollection {
    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();

        // Tạo một vài đối tượng Employee
        Employee e1 = new Employee("E001", "Nguyễn Văn An", true, LocalDate.of(1995, 1, 1), "0912345678", "an@gmail.com", 1000);
        Employee e2 = new Employee("E002", "Trần Thị Bình", false, LocalDate.of(1990, 5, 20), "0987654321", "binh@gmail.com", 1500);
        Employee e3 = new Employee("E003", "Phạm Văn Cường", true, LocalDate.of(1988, 8, 8), "0909090909", "cuong@gmail.com", 2000);

        // Thêm nhân viên
        System.out.println("Thêm E001: " + employeeCollection.them(e1)); // true
        System.out.println("Thêm E002: " + employeeCollection.them(e2)); // true
        System.out.println("Thêm lại E001: " + employeeCollection.them(e1)); // false (trùng)

        // Xoá nhân viên
        System.out.println("Xoá E002: " + employeeCollection.xoa("E002")); // true
        System.out.println("Xoá không tồn tại E005: " + employeeCollection.xoa("E005")); // false

        // Tìm kiếm nhân viên
        System.out.println("Tìm E001: " + employeeCollection.tim("E001"));
        System.out.println("Tìm E005: " + employeeCollection.tim("E005"));

        // In danh sách nhân viên còn lại
        System.out.println("Danh sách nhân viên còn lại:");
        for (Employee e : employeeCollection.getdanhsachnhanvien()) {
            System.out.println(e);
        }
    }
}
