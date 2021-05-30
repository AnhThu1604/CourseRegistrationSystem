package pojo;

import java.util.Date;

public class GiaoVu implements java.io.Serializable{
    private String ma;
    private String hoVaTen;
    private String phai;
    private Date ngaySinh;
    private String diaChi;
    private String CMND;
    private String matKhau;
    private String email;
    private int maQuyenDN;

    public GiaoVu(){

    }

    public GiaoVu(String ma){
        this.ma = ma;
    }

    public GiaoVu(String ma, String hoVaTen, String phai, Date ngaySinh, String diaChi,
                  String CMND, String matKhau, String email){
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.CMND = CMND;
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

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public int getMaQuyenDN() {
        return maQuyenDN;
    }

    public void setMaQuyenDN(int maQuyenDN) {
        this.maQuyenDN = maQuyenDN;
    }
}
