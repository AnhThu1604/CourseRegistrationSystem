package pojo;

public class PhieuDkEntity {
    private int maPhieu;
    private SinhvienEntity sinhVien;
    private HocphanEntity hocPhan;

    public PhieuDkEntity() {

    }

    public PhieuDkEntity(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public PhieuDkEntity(SinhvienEntity sv, HocphanEntity hp) {
        this.sinhVien = sv;
        this.hocPhan = hp;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public SinhvienEntity getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhvienEntity sinhVien) {
        this.sinhVien = sinhVien;
    }

    public HocphanEntity getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocphanEntity hocPhan) {
        this.hocPhan = hocPhan;
    }


}
