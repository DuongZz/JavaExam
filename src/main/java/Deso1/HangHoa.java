
package Deso1;

import java.util.Scanner;


public class HangHoa {
    private String maHang;
    private String ten;
    private int giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHang, String ten, int giaBan) {
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

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    public void showInfo(){
        System.out.println(">>>Thông tin hàng: ");
        System.out.println("Mã hàng: "+ maHang);
        System.out.println("Tên hàng: "+ ten);
        System.out.println("Giá bán: "+ giaBan);
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>Nhập thông tin hàng: ");
        System.out.print("Nhập mã hàng: ");
        maHang = input.nextLine();
        System.out.print("Nhập tên hàng: ");
        ten = input.nextLine();
        System.out.print("Nhập giá bán: ");
        giaBan = input.nextInt();
    }
    
    public static void main(String[] args) {
        DienThoai dt = new DienThoai();
        dt.input();
        dt.showInfo();     
    }
}
