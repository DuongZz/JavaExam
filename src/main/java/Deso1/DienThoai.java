
package Deso1;

import java.util.Scanner;

public class DienThoai extends HangHoa {
    private String nsx;
    private String dungLuong;
    private MauSac mausac;

    public DienThoai() {
        super();
    }

    public DienThoai(String nsx, String dungLuong, MauSac mausac, String maHang, String ten, int giaBan) {
        super(maHang, ten, giaBan);
        this.nsx = nsx;
        this.dungLuong = dungLuong;
        this.mausac = mausac;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public MauSac getMausac() {
        return mausac;
    }

    public void setMausac(MauSac mausac) {
        this.mausac = mausac;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Nhà sản xuất: " + nsx);
        System.out.println("Dung lượng: " + dungLuong);
        System.out.println("Màu sắc: " + mausac);
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhà sản xuất: ");
        nsx = input.nextLine();
        System.out.print("Nhập dung lượng: ");
        dungLuong = input.nextLine();
        System.out.print("Nhập màu sắc (XANH ||DO|| HONG): ");
        String color = input.nextLine();
        mausac = MauSac.valueOf(color.toUpperCase());
    }
}
