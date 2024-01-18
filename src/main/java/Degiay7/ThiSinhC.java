package Degiay7;

import java.util.Scanner;

public class ThiSinhC extends ThiSinh {
    private float van;
    private float su;
    private float dia;   

    public ThiSinhC(float van, float su, float dia, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }
    
    public ThiSinhC(){
        
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        this.su = su;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }
    
    public float getDiemTK(){
        float totalScore = this.van + this.su + this.dia;
        return totalScore;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Điểm toán: "+this.van);
        System.out.println("Điểm lý: "+this.su);
        System.out.println("Điểm hóa: "+this.dia);
        System.out.println();
    }
    
    @Override
    public void newStu(){
        Scanner input = new Scanner(System.in);
        super.showInfo();
        System.out.print("Nhập điểm văn: ");
        this.van = input.nextFloat();
        System.out.print("Nhập điểm sử: ");
        this.su = input.nextFloat();
        System.out.print("Nhập điểm địa: ");
        this.dia = input.nextFloat();
    }
    
}
