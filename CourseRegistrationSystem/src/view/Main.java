
package view;


import dao.LopHocDAO;
import dao.SinhVienDAO;
import pojo.LophocEntity;
import pojo.SinhvienEntity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhap().setVisible(true);
            }
        });

    }
}
