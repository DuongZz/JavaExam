package De2;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nhanvien = new ArrayList<>();
        Employee employee = new Employee(nhanvien);
        employee.setVisible(true);
        employee.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
