package gamemodel;

public abstract class NhanVat implements TanCong {
    private String ten;
    private int mau;
    private String vukhi;

    public NhanVat(String ten, int mau, String vukhi) {
        this.ten = ten;
        this.mau = mau;
        this.vukhi = vukhi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public String getVukhi() {
        return vukhi;
    }

    public void setVukhi(String vukhi) {
        this.vukhi = vukhi;
    }

    @Override
    public String toString() {
        return "NhanVat [ten=" + ten + ", mau=" + mau + ", vukhi=" + vukhi + "]";
    }
}
