package De3;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        ArrayList<StudentManagement> stdm = new ArrayList<>();
        StudentManagement stdmGUI = new StudentManagement(stdm);
        stdmGUI.setVisible(true);
        stdmGUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
