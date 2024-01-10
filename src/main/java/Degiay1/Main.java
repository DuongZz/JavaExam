
package Degiay1;

import java.util.ArrayList;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phone = new ArrayList<>();
        Phone phonePage = new Phone(phone);
        phonePage.setVisible(true);
        phonePage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
