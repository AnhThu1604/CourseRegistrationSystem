package pojo;

public class PhieuDK {
    private String maSinhVien;
    private String maHocPhan;

    public PhieuDK(){

    }

    public PhieuDK(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public PhieuDK(String maSinhVien, String maHocPhan){
        this.maSinhVien = maSinhVien;
        this.maHocPhan = maHocPhan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }
}
