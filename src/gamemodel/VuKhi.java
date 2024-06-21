package gamemodel;
//
public abstract class VuKhi implements Cloneable {
    private int satThuong;

    public VuKhi(int satThuong) {
        this.satThuong = satThuong;
    }

    public int getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(int satThuong) {
        this.satThuong = satThuong;
    }

    public void tanCong() {
        System.out.println("Tấn công với vũ khí!");
    }

    @Override
    public String toString() {
        return "VuKhi [satThuong=" + satThuong + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
