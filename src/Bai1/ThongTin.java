package Bai1;

public class ThongTin {
    public static void main(String[] args) {

        NhanVien nhanVien1 = new NhanVien("NV01", "Hân", 25, "0123456", "Ha Noi");
        NhanVien nhanVien2 = new NhanVien("NV02", "Bình", 30, "0123456", "Da Nang");

        nhanVien1.showInfo();
        System.out.println("======================");
        nhanVien2.showInfo();

    }
}
