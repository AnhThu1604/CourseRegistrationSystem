import dao.SinhVienDAO;
import pojo.SinhVien;

public class Main {
    public static void main(String[] args) {
//<editor-fold defaultstate="collapsed" desc="2. Lấythông tin sinh viên">
        SinhVien sv = SinhVienDAO.layThongTinSinhVien("0312143");
        if (sv != null) {
            System.out.println("MSSV: " + sv.getMaSinhVien());
            System.out.println("Họ và tên: " +
                    sv.getHoVaTen());
            System.out.println("Ngày sinh: " +
                    sv.getNgaySinh());
            System.out.println("Địa chỉ: " + sv.getDiaChi());
        } else {
            System.out.println("Sinh viên 0312143 không tồn tại");
        }
    }
}
