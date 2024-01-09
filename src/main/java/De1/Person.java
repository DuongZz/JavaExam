package De1;


import java.util.Scanner;

public class Person {
    String hoten;
    String ngaysinh;
    String diachi;
    String gioitinh;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public Person(String hoten, String ngaysinh, String diachi, String gioitinh){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
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
        Person person = new Person(hoten, ngaysinh, diachi, gioitinh);
        System.out.println("THÔNG TIN PERSON: ");
        System.out.println("Họ tên: " + person.getHoten());
        System.out.println("Ngày sinh: " + person.getNgaysinh());
        System.out.println("Địa chỉ: " + person.getDiachi());
        System.out.println("Giới tính: " + person.getGioitinh());
    }
}
