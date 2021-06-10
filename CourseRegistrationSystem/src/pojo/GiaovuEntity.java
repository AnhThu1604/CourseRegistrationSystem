package pojo;

import java.util.Date;
import java.util.Objects;

public class GiaovuEntity {
    private String ma;
    private String hoVaTen;
    private String phai;
    private Date ngaySinh;
    private String diaChi;
    private String cmnd;
    private String matKhau;
    private String email;
    private int maQuyenDn;

    public GiaovuEntity() {

    }

    public GiaovuEntity(String ma) {
        this.ma = ma;
    }

    public GiaovuEntity(String ma, String hoVaTen, String phai, Date ngaySinh, String diaChi,
                        String cmnd, String matKhau, String email) {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
        this.matKhau = matKhau;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
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
        GiaovuEntity that = (GiaovuEntity) o;
        return maQuyenDn == that.maQuyenDn && Objects.equals(ma, that.ma) && Objects.equals(hoVaTen, that.hoVaTen) && Objects.equals(phai, that.phai) && Objects.equals(ngaySinh, that.ngaySinh) && Objects.equals(diaChi, that.diaChi) && Objects.equals(cmnd, that.cmnd) && Objects.equals(matKhau, that.matKhau) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ma, hoVaTen, phai, ngaySinh, diaChi, cmnd, matKhau, email, maQuyenDn);
    }
}
