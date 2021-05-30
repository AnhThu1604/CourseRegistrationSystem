import dao.SinhVienDAO;
import pojo.SinhvienEntity;

import java.util.List;

public class Main {
    public static void main(final String[] args) throws Exception {
        SinhVienDAO sinhVienDao = new SinhVienDAO();
        List<SinhvienEntity> ds = sinhVienDao.laySV();
        for (int i = 0; i < ds.size(); i++) {
            SinhvienEntity sv = ds.get(i);
            System.out.println("MSSV: " + sv.getMaSinhVien());
            System.out.println("Họ và tên: " + sv.getHoVaTen());
            System.out.println("Ngày sinh: " +
                    sv.getNgaySinh());
            System.out.println("Địa chỉ: " + sv.getDiaChi());
        }
    }

}
