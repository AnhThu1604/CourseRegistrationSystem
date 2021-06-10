package pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LophocEntity {
    private String maLopHoc;
    private Integer tongSv;
    private Integer tongSvNam;
    private Integer tongSvNu;
    private Set<SinhvienEntity> sinhViens = new HashSet<SinhvienEntity>(0);

    public LophocEntity() {

    }

    public LophocEntity(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }


    public LophocEntity(String maLopHoc, Integer tongSv, Integer tongSvNam, Integer tongSvNu) {
        this.maLopHoc = maLopHoc;
        this.tongSv = tongSv;
        this.tongSvNam = tongSvNam;
        this.tongSvNu = tongSvNu;
    }

    public Set<SinhvienEntity> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(Set<SinhvienEntity> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public Integer getTongSv() {
        return tongSv;
    }

    public void setTongSv(Integer tongSv) {
        this.tongSv = tongSv;
    }

    public Integer getTongSvNam() {
        return tongSvNam;
    }

    public void setTongSvNam(Integer tongSvNam) {
        this.tongSvNam = tongSvNam;
    }

    public Integer getTongSvNu() {
        return tongSvNu;
    }

    public void setTongSvNu(Integer tongSvNu) {
        this.tongSvNu = tongSvNu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LophocEntity that = (LophocEntity) o;
        return Objects.equals(maLopHoc, that.maLopHoc) && Objects.equals(tongSv, that.tongSv) && Objects.equals(tongSvNam, that.tongSvNam) && Objects.equals(tongSvNu, that.tongSvNu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maLopHoc, tongSv, tongSvNam, tongSvNu);
    }
}
