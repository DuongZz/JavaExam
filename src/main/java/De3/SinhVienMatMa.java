
package De3;

import java.util.Scanner;

public class SinhVienMatMa extends SinhVien {
    String donVi;
    int luong;

    public SinhVienMatMa(String donVi, int luong, String msv, String hoTen, String ngaySinh, String gioiTinh, double dtb) {
        super(msv, hoTen, ngaySinh, gioiTinh, dtb);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public void showInfo() {
        System.out.println("Mã Sinh Viên: "+this.msv+"\nHọ tên: "+this.hoTen+"\nNgày sinh: "+this.ngaySinh
        +"\nGiới tính: "+this.gioiTinh+"\nĐiểm trung bình: "+this.dtb+"\nĐơn vị: "+this.donVi+"\nLương: "+this.luong);
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
        System.out.print("Nhập đơn vị: ");
        String donVi = input.nextLine();
        System.out.print("Nhập lương: ");
        int luong = input.nextInt();
        SinhVienMatMa svmm = new SinhVienMatMa(donVi, luong, msv, hoTen, ngaySinh, gioiTinh, dtb);
        svmm.showInfo();
    }
    
    
}
