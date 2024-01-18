package Degiay7;

import java.util.Scanner;

public class ThiSinhA extends ThiSinh {
    private float toan;
    private float ly;
    private float hoa;

    public ThiSinhA(float toan, float ly, float hoa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public ThiSinhA() {
        super();
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
    
    public float getDiemTK(){
        float totalScore = this.toan + this.ly + this.hoa;
        return totalScore;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Điểm toán: "+this.toan);
        System.out.println("Điểm lý: "+this.ly);
        System.out.println("Điểm hóa: "+this.hoa);
        System.out.println();
    }
    
    @Override
    public void newStu(){
        Scanner input = new Scanner(System.in);
        super.newStu();
        System.out.print("Nhập điểm toán: ");
        this.toan = input.nextFloat();
        System.out.print("Nhập điểm lý: ");
        this.ly = input.nextFloat();
        System.out.print("Nhập điểm hóa: ");
        this.hoa = input.nextFloat();
        
    }
}
