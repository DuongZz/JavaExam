package Dethi664;

import java.util.Scanner;

public class ThiSinh {
    String hoten;
    String ngaySinh;
    String diaChi;

    public ThiSinh(String hoten, String ngaySinh, String diaChi) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>Nhập thông tin: ");
        System.out.print("Nhập họ tên: ");
        hoten = input.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println(">>> Thông tin thí sinh: ");
        System.out.println("Họ tên: " +hoten);
        System.out.println("Ngày sinh: " +ngaySinh);
        System.out.println("Địa chỉ: " +diaChi);
    }
}
