package pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HockiEntity {
    private int maHocKi;
    private String tenHocKi;
    private int namHoc;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int kiHienTai;
    private Set<MonhocEntity> mons = new HashSet<MonhocEntity>(0);
    private Set<DangkiHpEntity> dks = new HashSet<DangkiHpEntity>(0);

    public HockiEntity() {
    }

    public HockiEntity(int maHocKi) {
        this.maHocKi = maHocKi;
    }

    public HockiEntity(int maHocKi, String tenHocKi, Date ngayBatDau, Date ngayKetThuc) {
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

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
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

    public int getKiHienTai() {
        return kiHienTai;
    }

    public void setKiHienTai(int kiHienTai) {
        this.kiHienTai = kiHienTai;
    }

    public Set<MonhocEntity> getMons() {
        return mons;
    }

    public void setMons(Set<MonhocEntity> mons) {
        this.mons = mons;
    }

    public Set<DangkiHpEntity> getDks() {
        return dks;
    }

    public void setDks(Set<DangkiHpEntity> dks) {
        this.dks = dks;
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
