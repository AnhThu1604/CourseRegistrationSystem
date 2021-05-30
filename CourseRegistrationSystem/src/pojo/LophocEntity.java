package pojo;

import java.util.Objects;

public class LophocEntity {
    private String maLopHoc;
    private Integer tongSv;
    private Integer tongSvNam;
    private Integer tongSvNu;

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
