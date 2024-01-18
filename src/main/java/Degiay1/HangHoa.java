package Degiay1;

import java.util.Scanner;

public class HangHoa {
    String maHang;
    String ten;
    float giaBan;

    public HangHoa(String maHang, String ten, float giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getInfo() {
        return "HangHoa{" + "maHang=" + maHang + ", ten=" + ten + ", giaBan=" + giaBan + '}';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        String maHang = input.nextLine();
        System.out.print("Nhập tên hàng: ");
        String tenHang = input.nextLine();
        System.out.print("Nhập giá bán: ");
        float giaBan = input.nextFloat();
        HangHoa hh = new HangHoa(maHang, tenHang, giaBan);
        System.out.println(">>>>Thông tin mặt hàng: " + hh.getInfo());

    }
    
}
