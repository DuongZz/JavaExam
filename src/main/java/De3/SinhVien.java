package De3;

import java.util.Scanner;

public class SinhVien {
    String msv;
    String hoTen;
    String ngaySinh;
    String gioiTinh;
    double dtb;

    public SinhVien(String msv, String hoTen, String ngaySinh, String gioiTinh, double dtb) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dtb = dtb;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    public void showInfo(){
        System.out.println("Mã Sinh Viên: "+this.msv+"\nHọ tên: "+this.hoTen+"\nNgày sinh: "+this.ngaySinh
        +"\nGiới tính: "+this.gioiTinh+"\nĐiểm trung bình: "+this.dtb);     
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String msv = input.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = input.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ngaySinh = input.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = input.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double dtb = input.nextDouble();
        SinhVien sv = new SinhVien(msv, hoTen, ngaySinh, gioiTinh, dtb);
        sv.showInfo();
    }
}
