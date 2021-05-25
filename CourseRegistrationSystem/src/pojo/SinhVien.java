package pojo;

import java.util.Date;
public class SinhVien implements java.io.Serializable{

    private String maSinhVien;
    private String hoVaTen;
    private String phai;
    private Date ngaySinh;
    private String diaChi;

    private String lopDST;
    private int maNguoiDung;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoVaTen, String phai, Date ngaySinh, String diaChi, String lopDST, int maNguoiDung){
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.lopDST = lopDST;
        this.maNguoiDung= maNguoiDung;
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

    public String getLopDST() {
        return lopDST;
    }

    public void setLopDST(String lopDST) {
        this.lopDST = lopDST;
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

}
