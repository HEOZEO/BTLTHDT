package gamemodel;
//
public class Choi extends VuKhi {
    private int tamDanh;

    public Choi(int satThuong, int tamDanh) {
        super(satThuong);
        this.tamDanh = tamDanh;
    }

    public int getTamDanh() {
        return tamDanh;
    }

    public void setTamDanh(int tamDanh) {
        this.tamDanh = tamDanh;
    }

    public void nemChoi() {
        System.out.println("Ném chòi!");
    }

    @Override
    public String toString() {
        return "Choi [tamDanh=" + tamDanh + "]";
    }
}
