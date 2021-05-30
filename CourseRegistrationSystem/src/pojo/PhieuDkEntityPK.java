package pojo;

import java.io.Serializable;
import java.util.Objects;

public class PhieuDkEntityPK implements Serializable {
    private String maSv;
    private String maHocPhan;

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhieuDkEntityPK that = (PhieuDkEntityPK) o;
        return Objects.equals(maSv, that.maSv) && Objects.equals(maHocPhan, that.maHocPhan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSv, maHocPhan);
    }
}
