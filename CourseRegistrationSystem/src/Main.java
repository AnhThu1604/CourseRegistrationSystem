import dao.GiaoVuDAO;
import dao.LopHocDAO;
import dao.SinhVienDAO;

import pojo.LophocEntity;
import pojo.SinhvienEntity;

import pojo.SinhvienEntity;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws Exception {
        SinhvienEntity sv = new SinhvienEntity();
        sv.setMaSinhVien("18120582");
        sv.setHoVaTen("Phạm Thị Anh Thư");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1985, 5, 18);
        Date d = calendar.getTime();
        sv.setNgaySinh(d);
        sv.setDiaChi("Vũng Liêm – Vĩnh Long");
        sv.setLop("18CTT2");
        int kq = SinhVienDAO.addSV(sv);
        if (kq == 1) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
//</editor-fold>

    }


}
