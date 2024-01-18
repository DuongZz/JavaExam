
package Degiay1;

import java.util.Scanner;

public class DienThoai extends HangHoa {
    String nsx;
    String dungLuong;
    String mau;

    public DienThoai(String nsx, String dungLuong, String mau, String maHang, String ten, float giaBan) {
        super(maHang, ten, giaBan);
        this.nsx = nsx;
        this.dungLuong = dungLuong;
        this.mau = mau;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String getInfo() {
        return "DienThoai{" + "nsx=" + nsx + ", dungLuong=" + dungLuong + ", mau=" + mau + '}'+ "maHang=" + maHang + ", ten=" + ten + ", giaBan=" + giaBan + '}';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        String maHang = input.nextLine();
        System.out.print("Nhập tên hàng: ");
        String ten = input.nextLine();
        System.out.print("Nhập giá bán: ");
        float giaBan = input.nextFloat();
        input.nextLine();
        System.out.print("Nhập nhà sản xuất:");
        String nsx = input.nextLine();
        System.out.print("Nhập dung lượng bộ nhớ: ");
        String dungLuong = input.nextLine();
        System.out.print("Nhập màu sắc: ");
        String mau = input.nextLine();
        DienThoai dt = new DienThoai(nsx, dungLuong, mau, maHang, ten, giaBan);
        System.out.println(">>> Thông tin điện thoại: "+dt.getInfo());
    }
}
