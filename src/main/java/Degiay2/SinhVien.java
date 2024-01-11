package Degiay2;

import java.util.Scanner;

public class SinhVien extends Person { 
    String cn;
    float dqt;
    float dhp;
    float dtk;

    public SinhVien(String cn, float dqt, float dhp, String hoten, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoten, ngaySinh, diaChi, gioiTinh);
        this.cn = cn;
        this.dqt = dqt;
        this.dhp = dhp;
        this.dtk = getDtk();
        
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public float getDqt() {
        return dqt;
    }

    public void setDqt(float dqt) {
        this.dqt = dqt;
    }

    public float getDhp() {
        return dhp;
    }

    public void setDhp(float dhp) {
        this.dhp = dhp;
    }

    @Override
    public String getInfo() {
        return "SinhVien{" + "hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", cn=" + cn + ", dqt=" + dqt + ", dhp=" + dhp + ", dtk= "+dtk + '}';
    }
    public float getDtk(){
        return dtk = (float) (dqt*0.3 + dhp*0.7);
    }
    
    public String Rating(){
        if(dtk < 4){
            return "F";
        } else if ( dtk > 4 && dtk < 5){
            return "D";
        } else if (dtk >= 5 && dtk < 6){
            return "C";
        } else if (dtk >=6 && dtk < 8.5) {
            return "B";
        } else {
            return "A";
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String hoten = input.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ngaySinh = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = input.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = input.nextLine();
        System.out.print("Nhập chuyên ngành: ");
        String cn = input.nextLine();
        System.out.print("Nhập điểm quá trình: ");
        float dqt = input.nextFloat();
        System.out.print("Nhập điểm học phần: ");
        float dhp = input.nextFloat();
        SinhVien sv = new SinhVien(cn, dqt, dhp, hoten, ngaySinh, diaChi, gioiTinh);
        System.out.println(">>> Thông tin sinh viên: "+ sv.getInfo());
        System.out.println("Xếp hạng: " + sv.Rating());
    }
    
}
