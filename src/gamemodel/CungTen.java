package gamemodel;

public class CungTen extends VuKhi {
    private int soMuiTen;

    public CungTen(int satThuong, int soMuiTen) {
        super(satThuong);
        this.soMuiTen = soMuiTen;
    }

    public int getSoMuiTen() {
        return soMuiTen;
    }

    public void setSoMuiTen(int soMuiTen) {
        this.soMuiTen = soMuiTen;
    }

    public void banTen() {
        System.out.println("Bắn cung tên!");
    }

    @Override
    public String toString() {
        return "CungTen [soMuiTen=" + soMuiTen + "]";
    }
}
