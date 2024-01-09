
package De3;

import java.util.Scanner;

public class SinhvienATTT extends SinhVien {
    int hocPhi;

    public SinhvienATTT(int hocPhi, String msv, String hoTen, String ngaySinh, String gioiTinh, double dtb) {
        super(msv, hoTen, ngaySinh, gioiTinh, dtb);
        this.hocPhi = hocPhi;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public void showInfo() {
        System.out.println("Mã Sinh Viên: "+this.msv+"\nHọ tên: "+this.hoTen+"\nNgày sinh: "+this.ngaySinh
        +"\nGiới tính: "+this.gioiTinh+"\nĐiểm trung bình: "+this.dtb+"\nHọc phí: "+this.hocPhi);
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
        System.out.println("Nhập học phí: ");
        int hocPhi = input.nextInt();
        SinhvienATTT svAT = new SinhvienATTT(hocPhi, msv, hoTen, ngaySinh, gioiTinh, dtb);
        svAT.showInfo();
    }
}
