package pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class HockiEntity {
    private int maHocKi;
    private String tenHocKi;
    private Timestamp namHoc;
    private Timestamp ngayBatDau;
    private Timestamp ngayKetThuc;

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

    public Timestamp getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(Timestamp namHoc) {
        this.namHoc = namHoc;
    }

    public Timestamp getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Timestamp ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Timestamp getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Timestamp ngayKetThuc) {
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
