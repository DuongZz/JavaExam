
package DeThi512;

import java.util.Scanner;


public class KySu extends CanBo {
    String nganhDaoTao;

    public KySu(String nganhDaoTao, String ten, int tuoi, String diaChi, String gioiTinh) {
        super(ten, tuoi, diaChi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    
    @Override
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập ngành đào tạo: ");
        nganhDaoTao = input.nextLine();
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Ngành đào tạo: " +nganhDaoTao);
    }
}
