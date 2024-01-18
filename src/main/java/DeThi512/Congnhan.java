
package DeThi512;

import java.util.Scanner;

public class Congnhan extends CanBo {
    String bac;

    public Congnhan(String bac, String ten, int tuoi, String diaChi, String gioiTinh) {
        super(ten, tuoi, diaChi, gioiTinh);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập cấp bậc: ");
        bac = input.nextLine();
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Cấp bậc: " +bac);
    }
    
}
