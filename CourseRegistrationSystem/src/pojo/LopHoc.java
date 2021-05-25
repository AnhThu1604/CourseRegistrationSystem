package pojo;

public class LopHoc {
    private String maLopHoc;
    private int tongSVNam;
    private int tongSVNu;

    public LopHoc(){

    }

    public LopHoc(String maLopHoc){
        this.maLopHoc = maLopHoc;
    }

    public LopHoc(String maLopHoc, int tongSVNam, int tongSVNu){
        this.maLopHoc = maLopHoc;
        this.tongSVNam = tongSVNam;
        this.tongSVNu = tongSVNu;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public int getTongSVNam() {
        return tongSVNam;
    }

    public void setTongSVNam(int tongSVNam) {
        this.tongSVNam = tongSVNam;
    }

    public int getTongSVNu() {
        return tongSVNu;
    }

    public void setTongSVNu(int tongSVNu) {
        this.tongSVNu = tongSVNu;
    }
}
