package pojo;

import java.util.Date;
import java.util.Objects;

public class SinhvienEntity {
    private String maSinhVien;
    private String hoVaTen;
    private Date ngaySinh;
    private String phai;
    private String diaChi;
    private String cmnd;
    private String lop;
    private String matKhau;
    private String email;
    private int maQuyenDn;

    public SinhvienEntity(){

    }

    public SinhvienEntity(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public SinhvienEntity(String maSinhVien, String hoVaTen, String phai, Date ngaySinh, String diaChi,
                        String cmnd, String lop, String matKhau, String email){
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
        this.lop = lop;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
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

    public int getMaQuyenDn() {
        return maQuyenDn;
    }

    public void setMaQuyenDn(int maQuyenDn) {
        this.maQuyenDn = maQuyenDn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhvienEntity that = (SinhvienEntity) o;
        return maQuyenDn == that.maQuyenDn && Objects.equals(maSinhVien, that.maSinhVien) && Objects.equals(hoVaTen, that.hoVaTen) && Objects.equals(ngaySinh, that.ngaySinh) && Objects.equals(phai, that.phai) && Objects.equals(diaChi, that.diaChi) && Objects.equals(cmnd, that.cmnd) && Objects.equals(lop, that.lop) && Objects.equals(matKhau, that.matKhau) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien, hoVaTen, ngaySinh, phai, diaChi, cmnd, lop, matKhau, email, maQuyenDn);
    }
}
