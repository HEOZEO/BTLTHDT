package gamemodel;
//
public class BinhDoan {
    private String tenbinhdoan;
    private DoiQuan doi;
    private NhanVat nhanVat;

    public BinhDoan(String tenbinhdoan, DoiQuan doi) {
        this.tenbinhdoan = tenbinhdoan;
        this.doi = doi;
    }

    public String getTenbinhdoan() {
        return tenbinhdoan;
    }

    public void setTenbinhdoan(String tenbinhdoan) {
        this.tenbinhdoan = tenbinhdoan;
    }

    public DoiQuan getDoi() {
        return doi;
    }

    public void setDoi(DoiQuan doi) {
        this.doi = doi;
    }

    public NhanVat getNhanVat() {
        return nhanVat;
    }

    public void setNhanVat(NhanVat nhanVat) {
        this.nhanVat = nhanVat;
    }

    @Override
    public String toString() {
        return "BinhDoan [tenbinhdoan=" + tenbinhdoan + ", doi=" + doi + "]";
    }
}
