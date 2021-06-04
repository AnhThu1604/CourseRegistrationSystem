package pojo;

import java.util.Objects;

public class MonhocEntity {
    private String maMonHoc;
    private String tenMonHoc;
    private Integer soTinChi;

    public MonhocEntity(){

    }

    public MonhocEntity(String maMonHoc){
        this.maMonHoc = maMonHoc;
    }

    public MonhocEntity(String maMonHoc, String tenMonHoc, Integer soTinChi){
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this. soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonhocEntity that = (MonhocEntity) o;
        return Objects.equals(maMonHoc, that.maMonHoc) && Objects.equals(tenMonHoc, that.tenMonHoc) && Objects.equals(soTinChi, that.soTinChi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMonHoc, tenMonHoc, soTinChi);
    }
}
