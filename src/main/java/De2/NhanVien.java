package De2;

import java.util.Scanner;

public class NhanVien extends Person {
    String phongban;
    double hesoluong;
    double thamnien;
    double luongcoban;
    double luongthuclinh;

    public NhanVien(String phongban, double hesoluong, double thamnien, double luongcoban, String hoten, String diachi, String gioitinh) {
        super(hoten, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
        this.luongthuclinh = getLuongThucLinh();
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getThamnien() {
        return thamnien;
    }

    public void setThamnien(double thamnien) {
        this.thamnien = thamnien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }


    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }
    
    public double getLuongThucLinh(){
        return luongcoban*hesoluong*(1+thamnien/100);
    }
    
    public void luongThucLinh(double luongthuclinh){
        this.luongthuclinh = getLuongThucLinh();  
    }
    public void getInfo(){
        System.out.println("Họ tên: "+this.hoten+"\nĐịa chỉ: "+this.diachi+"\nGiới tính: "+this.gioitinh
        +"\nPhòng Ban: "+this.phongban+"\nHệ số lương: "+this.hesoluong+"\nThâm niên: "+thamnien
        +"\nLương cơ bản: "+this.luongcoban+"\nLương thực lĩnh: "+this.luongthuclinh
        );
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoten = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diachi = input.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioitinh = input.nextLine();
        System.out.print("Nhập phòng ban: ");
        String phongban = input.nextLine();
        System.out.print("Nhập hệ số lương: ");
        float hesoluong = input.nextFloat();
        System.out.print("Nhập thâm niên: ");
        float thamnien = input.nextFloat();
        System.out.print("Nhập lương cơ bản: ");
        float luongcoban = input.nextFloat();
        NhanVien nhanvien = new NhanVien(phongban, hesoluong, thamnien, luongcoban, hoten, diachi, gioitinh);
        nhanvien.getInfo();
    }
       
}
