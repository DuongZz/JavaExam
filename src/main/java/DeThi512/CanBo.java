
package DeThi512;

import java.util.Scanner;

public class CanBo {
    String ten;
    int tuoi;
    String diaChi;
    String gioiTinh;

    public CanBo(String ten, int tuoi, String diaChi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>> Nhập thông tin: ");
        System.out.print("Nhập tên: ");
        ten = input.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = input.nextInt();
        System.out.print("Nhập địa chỉ: ");
        diaChi = input.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println("Thông tin: ");
        System.out.println("Tên: " +ten);
        System.out.println("Tuổi" +tuoi);
        System.out.println("Địa chỉ: " +diaChi);
        System.out.println("Giới tính: "+ gioiTinh);
    }
}
