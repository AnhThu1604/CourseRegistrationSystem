package pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class DangkiHpEntity {
    private int maDkhp;
    private Timestamp ngayBatDau;
    private Timestamp ngayKetThuc;

    public int getMaDkhp() {
        return maDkhp;
    }

    public void setMaDkhp(int maDkhp) {
        this.maDkhp = maDkhp;
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
        DangkiHpEntity that = (DangkiHpEntity) o;
        return maDkhp == that.maDkhp && Objects.equals(ngayBatDau, that.ngayBatDau) && Objects.equals(ngayKetThuc, that.ngayKetThuc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDkhp, ngayBatDau, ngayKetThuc);
    }
}
