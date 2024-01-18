
package Degiay7;

import java.util.ArrayList;
import java.util.Scanner;


public class ThiSinh {
    String ten;
    String ngaySinh;
    String diaChi;

    public ThiSinh(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public ThiSinh(){
        
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
    
    public void newStu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.ten = input.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println(">>>Thông tin thí sinh: ");
        System.out.println("Họ tên: "+this.ten);
        System.out.println("Ngày sinh: "+this.ngaySinh);
        System.out.println("Địa chỉ: "+this.diaChi);
    }
    
    public static void main(String[] args) {
        ArrayList<ThiSinhA> tsAList = new ArrayList<>(); 
        ArrayList<ThiSinhC> tsCList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thí sinh khối A: ");
        int n = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < n; i++){
            System.out.println("Nhập thí sinh khối A thứ " + (i + 1) + ":");
            ThiSinhA tsA = new ThiSinhA();
            tsA.newStu();
            tsA.showInfo();
            tsAList.add(tsA);

        }
        
        System.out.println("Nhập số thí sinh khối C: ");
        int m = input.nextInt();

        for (int j = 0; j < m; j++) {
            System.out.println("Nhập thí sinh khối C thứ " + (j + 1) + ":");
            ThiSinhC tsC = new ThiSinhC();
            tsC.newStu();
            tsCList.add(tsC);
        }
        
        System.out.println("Thi sinh có điểm tổng kết > 20: ");
        for(ThiSinhA tsA : tsAList){
            if(tsA.getDiemTK() > 20) {
                tsA.showInfo();
            }
        }
        for(ThiSinhC tsC : tsCList){
            if(tsC.getDiemTK() > 20) {
                tsC.showInfo();
            }
        }
    }
}
