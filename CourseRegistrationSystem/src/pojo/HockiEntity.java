package pojo;

import java.util.Date;
import java.util.Objects;

public class HockiEntity {
    private int maHocKi;
    private String tenHocKi;
    private Date namHoc;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public HockiEntity(){

    }

    public HockiEntity(int maHocKi){
        this.maHocKi = maHocKi;
    }

    public HockiEntity(int maHocKi, String tenHocKi, Date ngayBatDau, Date ngayKetThuc){
        this.maHocKi = maHocKi;
        this.tenHocKi = tenHocKi;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaHocKi() {
        return maHocKi;
    }

    public void setMaHocKi(int maHocKi) {
        this.maHocKi = maHocKi;
    }

    public String getTenHocKi() {
        return tenHocKi;
    }

    public void setTenHocKi(String tenHocKi) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HockiEntity that = (HockiEntity) o;
        return maHocKi == that.maHocKi && Objects.equals(tenHocKi, that.tenHocKi) && Objects.equals(namHoc, that.namHoc) && Objects.equals(ngayBatDau, that.ngayBatDau) && Objects.equals(ngayKetThuc, that.ngayKetThuc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHocKi, tenHocKi, namHoc, ngayBatDau, ngayKetThuc);
    }
}
