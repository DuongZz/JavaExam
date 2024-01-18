
package Dethi664;

import java.util.Scanner;


public class ThiSinhA extends ThiSinh {
    private float toan;
    private float ly;
    private float hoa;

    public ThiSinhA(float toan, float ly, float hoa, String hoten, String ngaySinh, String diaChi) {
        super(hoten, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    
    @Override
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập điểm toán: ");
        toan = input.nextFloat();
        System.out.print("Nhập điểm lý: ");
        ly = input.nextFloat();
        System.out.print("Nhập điểm hóa: ");
        hoa = input.nextFloat();
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Điểm toán: " +toan);
        System.out.println("Điểm lý: " +ly);
        System.out.println("Điểm hóa: " +hoa);
    }
}
