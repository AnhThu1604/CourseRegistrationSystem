package pojo;

import java.util.Date;

public class NguoiDung implements java.io.Serializable {
    private int maNguoiDung;
    private String tenDangNhap;
    private String matKhau;
    private String email;
    private int maQuyenDN;

    public NguoiDung(){

    }

    public NguoiDung(int maNguoiDung){
        this.maNguoiDung = maNguoiDung;
    }

    public NguoiDung(int maNguoiDung, String tenDangNhap, String matKhau, String email, int maQuyenDN){
        this.maNguoiDung = maNguoiDung;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.maQuyenDN = maQuyenDN;
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaQuyenDN() {
        return maQuyenDN;
    }

    public void setMaQuyenDN(int maQuyenDN) {
        this.maQuyenDN = maQuyenDN;
    }
}
