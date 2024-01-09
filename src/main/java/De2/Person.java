package De2;

public class Person {
    String hoten;
    String ngaysinh;
    String diachi;
    String gioitinh;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Person(String hoten, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }
    
}
