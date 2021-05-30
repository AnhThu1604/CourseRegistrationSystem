package pojo;

import java.util.Objects;

public class HocphanEntity {
    private String maHocPhan;
    private String tenMonHoc;
    private Integer soTinChi;
    private String giaoVien;
    private String tenPhongHoc;
    private Integer ngayHoc;
    private Integer caHoc;
    private Integer slotToiDa;

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public Integer getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(Integer soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public Integer getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(Integer ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public Integer getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(Integer caHoc) {
        this.caHoc = caHoc;
    }

    public Integer getSlotToiDa() {
        return slotToiDa;
    }

    public void setSlotToiDa(Integer slotToiDa) {
        this.slotToiDa = slotToiDa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocphanEntity that = (HocphanEntity) o;
        return Objects.equals(maHocPhan, that.maHocPhan) && Objects.equals(tenMonHoc, that.tenMonHoc) && Objects.equals(soTinChi, that.soTinChi) && Objects.equals(giaoVien, that.giaoVien) && Objects.equals(tenPhongHoc, that.tenPhongHoc) && Objects.equals(ngayHoc, that.ngayHoc) && Objects.equals(caHoc, that.caHoc) && Objects.equals(slotToiDa, that.slotToiDa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHocPhan, tenMonHoc, soTinChi, giaoVien, tenPhongHoc, ngayHoc, caHoc, slotToiDa);
    }
}
