package pojo;


import java.util.HashSet;
import java.util.Set;

public class HocphanEntity {
    private String maHocPhan;
    private MonhocEntity monHoc;


    private String giaoVien;
    private String tenPhongHoc;
    private Integer ngayHoc;
    private Integer caHoc;
    private Integer slotToiDa;

    private Set<SinhvienEntity> sinhviens = new HashSet<SinhvienEntity>(0);

    public HocphanEntity(){

    }
    public HocphanEntity(String maHocPhan){
        this.maHocPhan = maHocPhan;
    }

    public HocphanEntity(String maHocPhan, MonhocEntity monHoc, String giaoVien,
                         String tenPhongHoc, Integer ngayHoc, Integer caHoc, Integer slotToiDa){
        this.maHocPhan = maHocPhan;
        this.monHoc = monHoc;
        this.giaoVien = giaoVien;
        this.tenPhongHoc = tenPhongHoc;
        this.ngayHoc = ngayHoc;
        this.caHoc = caHoc;
        this.slotToiDa = slotToiDa;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public MonhocEntity getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonhocEntity monHoc) {
        this.monHoc = monHoc;
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

    public Set<SinhvienEntity> getSinhviens() {
        return sinhviens;
    }

    public void setSinhviens(Set<SinhvienEntity> sinhviens) {
        this.sinhviens = sinhviens;
    }
}
