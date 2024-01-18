
package Dethi664;

import java.util.Scanner;

public class ThiSinhC extends ThiSinh {
    private float van;
    private float su;
    private float dia;

    public ThiSinhC(float van, float su, float dia, String hoten, String ngaySinh, String diaChi) {
        super(hoten, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
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
    
        @Override
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập điểm văn: ");
        van = input.nextFloat();
        System.out.print("Nhập điểm sử: ");
        su = input.nextFloat();
        System.out.print("Nhập điểm địa: ");
        dia = input.nextFloat();
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Điểm toán: " +van);
        System.out.println("Điểm lý: " +su);
        System.out.println("Điểm hóa: " +dia);
    }
}
