import view.DangNhap;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhap().setVisible(true);
            }
        });

    }
}
