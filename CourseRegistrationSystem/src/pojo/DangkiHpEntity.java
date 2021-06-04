package pojo;

import java.util.Date;
import java.util.Objects;

public class DangkiHpEntity {
    private int maDkhp;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public DangkiHpEntity(){

    }

    public DangkiHpEntity(int maDkhp){
        this.maDkhp = maDkhp;
    }

    public DangkiHpEntity(int maDkhp, Date ngayBatDau, Date ngayKetThuc)
    {
        this.maDkhp = maDkhp;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaDkhp() {
        return maDkhp;
    }

    public void setMaDkhp(int maDkhp) {
        this.maDkhp = maDkhp;
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
        DangkiHpEntity that = (DangkiHpEntity) o;
        return maDkhp == that.maDkhp && Objects.equals(ngayBatDau, that.ngayBatDau) && Objects.equals(ngayKetThuc, that.ngayKetThuc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDkhp, ngayBatDau, ngayKetThuc);
    }
}
