package gamemodel;

public class KyBinh extends NhanVat {
    private int tocDoNgua;

    public KyBinh(String ten, int mau, int tocDoNgua) {
        super(ten, mau, "Kiếm");
        this.tocDoNgua = tocDoNgua;
    }

    public int getTocDoNgua() {
        return tocDoNgua;
    }

    public void setTocDoNgua(int tocDoNgua) {
        this.tocDoNgua = tocDoNgua;
    }

    @Override
    public void tancongKhongVuKhi() {
        System.out.println("Kỵ binh tấn công không vũ khí!");
    }

    @Override
    public void tancongCoVuKhi() {
        System.out.println("Kỵ binh tấn công có vũ khí!");
    }

    @Override
    public String toString() {
        return "KyBinh [ten=" + getTen() + ", mau=" + getMau() + ", tocDoNgua=" + tocDoNgua + "]";
    }
}
