package test;

import collection.MoviesCollection;
import entity.Movies;

import java.time.LocalDate;

public class TestMoviesCollection {
    public static void main(String[] args) {
        MoviesCollection moviesCollection = new MoviesCollection();

        // Tạo phim mẫu
        Movies m1 = new Movies("M001", "Avengers: Endgame", "Action", "Anthony Russo", 181,
                LocalDate.of(2019, 4, 26), "English", "USA", "Kết thúc của hành trình siêu anh hùng Marvel.");
        
        Movies m2 = new Movies("M002", "Parasite", "Drama", "Bong Joon-ho", 132,
                LocalDate.of(2019, 5, 30), "Korean", "Korea", "Bộ phim đoạt giải Oscar, phản ánh xã hội Hàn Quốc.");
        
        Movies m3 = new Movies("M003", "Spirited Away", "Animation", "Hayao Miyazaki", 125,
                LocalDate.of(2001, 7, 20), "Japanese", "Japan", "Một cô bé bị lạc vào thế giới linh hồn.");

        // Thêm phim vào danh sách
        System.out.println("Thêm M001: " + moviesCollection.them(m1)); // true
        System.out.println("Thêm M002: " + moviesCollection.them(m2)); // true
        System.out.println("Thêm lại M001: " + moviesCollection.them(m1)); // false

        // Xoá phim
        System.out.println("Xoá M002: " + moviesCollection.xoa("M002")); // true
        System.out.println("Xoá M005 (không tồn tại): " + moviesCollection.xoa("M005")); // false

        // Tìm kiếm phim
        System.out.println("Tìm M001: " + moviesCollection.tim("M001")); // Có
        System.out.println("Tìm M005: " + moviesCollection.tim("M005")); // Không có

        // In danh sách phim còn lại
        System.out.println("Danh sách phim còn lại:");
        for (Movies m : moviesCollection.getdanhsachnhanvien()) {
            System.out.println(m);
        }
    }
}
