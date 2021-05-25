package pojo;

public class QuyenDN {
    private int maQuyenDN;
    private String tenQuyenDN;

    public QuyenDN(){

    }

    public QuyenDN(int maQuyenDN){
        this.maQuyenDN = maQuyenDN;
    }

    public QuyenDN(int maQuyenDN, String tenQuyenDN){
        this.maQuyenDN = maQuyenDN;
        this.tenQuyenDN = tenQuyenDN;
    }

    public int getMaQuyenDN() {
        return maQuyenDN;
    }

    public void setMaQuyenDN(int maQuyenDN) {
        this.maQuyenDN = maQuyenDN;
    }

    public String getTenQuyenDN() {
        return tenQuyenDN;
    }

    public void setTenQuyenDN(String tenQuyenDN) {
        this.tenQuyenDN = tenQuyenDN;
    }
}
