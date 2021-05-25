package pojo;

import java.util.Date;

public class GiaoVu implements java.io.Serializable{
    private String ma;
    private String hoVaTen;
    private String phai;
    private Date ngaySinh;
    private String diaChi;
    private int maNguoiDung;

    public GiaoVu(){

    }

    public GiaoVu(String ma){
        this.ma = ma;
    }

    public GiaoVu(String ma, String hoVaTen, String phai, Date ngaySinh, String diaChi, int maNguoiDung){
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maNguoiDung = maNguoiDung;
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

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }
}
