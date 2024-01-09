package De1;

import java.util.List;
import java.util.Scanner;


public class Student extends Person {
    private String msv;
    private String email;
    private String diemTK;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(String diemTK) {
        this.diemTK = diemTK;
    }

    public Student(String msv, String email, String diemTK, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.msv = msv;
        this.email = email;
        this.diemTK = diemTK;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập thông tin họ tên: ");
        String hoten = input.nextLine();
        System.out.print("Nhập thông tin ngày sinh: ");
        String ngaysinh = input.nextLine();
        System.out.print("Nhập thông tin địa chỉ: ");
        String diachi = input.nextLine();
        System.out.print("Nhập thông tin giới tính: ");
        String gioitinh = input.nextLine();
        System.out.print("Nhập thông tin mã sinh viên: ");
        String msv = input.nextLine();
        System.out.print("Nhập thông tin email: ");
        String email = input.nextLine();
        System.out.print("Nhập điểm tổng kết: ");
        String diemTK = input.nextLine();
        Student student = new Student(msv, email, diemTK, hoten, ngaysinh, diachi, gioitinh);
        System.out.println("THÔNG TIN PERSON: ");
        System.out.println("Họ tên: " + student.getHoten());
        System.out.println("Ngày sinh: " + student.getNgaysinh());
        System.out.println("Địa chỉ: " + student.getDiachi());
        System.out.println("Giới tính: " + student.getGioitinh());
        System.out.println("Mã sinh viên: " + student.getMsv());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Điểm tổng kết: " + student.getDiemTK());
    }

}
