package pojo;

import java.util.Date;

public class HocPhan {
    private String maHocPhan;
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;
    private String GVLT;
    private String tenPhongHoc;
    private int ngayHoc;
    private int caHoc;
    private int slotToiDa;
    private String maLopHoc;

    public HocPhan(){

    }

    public HocPhan(String maHocPhan){
        this.maHocPhan = maHocPhan;
    }

    public HocPhan(String maHocPhan, String maMonHoc, String tenMonHoc, int soTinChi, String GVLT,
                   String tenPhongHoc, int ngayHoc, int caHoc, int slotToiDa, String maLopHoc){
        this.maHocPhan = maHocPhan;
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.GVLT = GVLT;
        this.tenPhongHoc = tenPhongHoc;
        this.ngayHoc = ngayHoc;
        this.caHoc = caHoc;
        this.slotToiDa = slotToiDa;
        this.maLopHoc = maLopHoc;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
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

    public String getGVLT() {
        return GVLT;
    }

    public void setGVLT(String GVLT) {
        this.GVLT = GVLT;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public int getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(int ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public int getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(int caHoc) {
        this.caHoc = caHoc;
    }

    public int getSlotToiDa() {
        return slotToiDa;
    }

    public void setSlotToiDa(int slotToiDa) {
        this.slotToiDa = slotToiDa;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }
}
