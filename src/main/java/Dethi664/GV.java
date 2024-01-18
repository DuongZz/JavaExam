
package Dethi664;


public class GV {
    private String id, hoTen, maGV, diaChi, gioiTinh; 
    Khoa khoa;

    public GV(String id, String hoTen, String maGV, String diaChi, String gioiTinh, Khoa khoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
    public void showInfo(){
        System.out.println("ID: "+id);
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Mã giảng viên: "+maGV);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Giới tính: "+gioiTinh);
        System.out.println("Khoa: "+khoa); 
    }


}
