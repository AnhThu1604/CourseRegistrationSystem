package pojo;

import java.awt.dnd.DropTarget;
import java.util.Date;

public class HocKi {
    private String maHocKi;
    private int tenHocKi;
    private Date namHoc;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public  HocKi(){

    }

    public HocKi(String maHocKi){
        this.maHocKi = maHocKi;
    }

    public HocKi(String maHocKi, int tenHocKi, Date namHoc, Date ngayBatDau, Date ngayKetThuc){
        this.maHocKi = maHocKi;
        this.tenHocKi = tenHocKi;
        this.namHoc = namHoc;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaHocKi() {
        return maHocKi;
    }

    public void setMaHocKi(String maHocKi) {
        this.maHocKi = maHocKi;
    }

    public int getTenHocKi() {
        return tenHocKi;
    }

    public void setTenHocKi(int tenHocKi) {
        this.tenHocKi = tenHocKi;
    }

    public Date getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(Date namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
