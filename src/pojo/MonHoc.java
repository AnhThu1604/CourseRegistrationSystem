package pojo;

public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;
    private int maHocKi;

    public MonHoc(){

    }

    public MonHoc(String maMonHoc){
        this.maMonHoc = maMonHoc;
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi, int maHocKi){
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.maHocKi = maHocKi;
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

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getMaHocKi() {
        return maHocKi;
    }

    public void setMaHocKi(int maHocKi) {
        this.maHocKi = maHocKi;
    }
}
