
package De1;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> stuList = new ArrayList<>();
        
        SinhVien sv = new SinhVien(stuList);
        sv.setVisible(true);
        sv.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
