package pojo;

import java.util.Date;

public class DangKiHP {
    private int maDKHP;
    private int maHocKi;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public DangKiHP(){

    }

    public DangKiHP (int maDKHP){
        this.maDKHP = maDKHP;
    }

    public DangKiHP(int maDKHP, int maHocKi, Date ngayBatDau, Date ngayKetThuc){
        this.maDKHP = maDKHP;
        this.maHocKi = maHocKi;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }
}
