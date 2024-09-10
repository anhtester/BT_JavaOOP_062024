package Bai1;

public class NhanVien {
    public String msnv;
    public String name;
    public int age;
    public String phone;
    public String address;

    public NhanVien() {
    }

    public NhanVien(String msnv, String name, int age, String phone, String address) {
        this.msnv = msnv;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("MSNV: " + msnv);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }


}
