package test;


import collection.AccountCollection;
import entity.Account;

public class TestAccountCollection {
    public static void main(String[] args) {
        AccountCollection accountCollection = new AccountCollection();


        Account acc1 = new Account("A001", "user1", "pass1", "Active");
        Account acc2 = new Account("A002", "user2", "pass2", "Inactive");
        Account acc3 = new Account("A003", "user3", "pass3", "Active");
        System.out.println("Thêm A001: " + accountCollection.them(acc1)); // true
        System.out.println("Thêm A002: " + accountCollection.them(acc2)); // true
        System.out.println("Thêm lại A001: " + accountCollection.them(acc1)); // false (trùng)
        System.out.println("Xoá tài khoản A002: " + accountCollection.xoa("A002")); // true
        System.out.println("Xoá tài khoản không tồn tại A005: " + accountCollection.xoa("A005")); // false
        System.out.println("Tìm A001: " + accountCollection.tim("A001")); // Có
        System.out.println("Tìm A005: " + accountCollection.tim("A005")); // Không có
        System.out.println("Danh sách còn lại:");
        for (Account acc : accountCollection.getdanhsachnhanvien()) {
            System.out.println(acc);
        }
    }
}
