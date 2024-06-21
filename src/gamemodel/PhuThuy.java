package gamemodel;
//
public class PhuThuy extends NhanVat {
    private int nangLuong;

    public PhuThuy(String ten, int mau, int nangLuong) {
        super(ten, mau, "Phép thuật");
        this.nangLuong = nangLuong;
    }

    public int getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(int nangLuong) {
        this.nangLuong = nangLuong;
    }

    @Override
    public void tancongKhongVuKhi() {
        System.out.println("Phù thủy tấn công không vũ khí!");
    }

    @Override
    public void tancongCoVuKhi() {
        System.out.println("Phù thủy tấn công có vũ khí!");
    }

    public void suDungPhepThuat() {
        System.out.println("Phù thủy sử dụng phép thuật!");
    }

    @Override
    public String toString() {
        return "PhuThuy [ten=" + getTen() + ", mau=" + getMau() + ", nangLuong=" + nangLuong + "]";
    }
}
