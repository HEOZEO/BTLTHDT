package gamemodel;

import java.util.ArrayList;
import java.util.List;
//
public class DoiQuan {
    private String tendoiquan;
    private List<BinhDoan> dsbd;

    public DoiQuan(String tendoiquan) {
        this.tendoiquan = tendoiquan;
        this.dsbd = new ArrayList<>();
    }

    public void addBinhDoan(BinhDoan bd) {
        this.dsbd.add(bd);
    }

    public String getTendoiquan() {
        return tendoiquan;
    }

    public void setTendoiquan(String tendoiquan) {
        this.tendoiquan = tendoiquan;
    }

    public List<BinhDoan> getDsbd() {
        return dsbd;
    }

    public void setDsbd(List<BinhDoan> dsbd) {
        this.dsbd = dsbd;
    }

    @Override
    public String toString() {
        return "DoiQuan [tendoiquan=" + tendoiquan + ", dsbd=" + dsbd + "]";
    }
}
