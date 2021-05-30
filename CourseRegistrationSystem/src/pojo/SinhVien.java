package pojo;

import java.util.Date;
public class SinhVien implements java.io.Serializable{

    private String maSinhVien;
    private String hoVaTen;
    private String phai;
    private Date ngaySinh;
    private String diaChi;
    private String CMND;
    private String lop;
    private String matKhau;
    private String email;
    private int maQuyenDN;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoVaTen, String phai, Date ngaySinh,
                    String diaChi, String CMND, String lop, String matKhau, String email){
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.lop = lop;
        this.CMND = CMND;
        this.matKhau = matKhau;
        this.email = email;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
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
