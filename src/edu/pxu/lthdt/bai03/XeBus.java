package edu.pxu.lthdt.bai03;

import java.time.Year;

public class XeBus {
    private String hangXe;
    private int namSanXuat;
    private int dongCo;
    private int soGhe;

    public XeBus(String hangXe, int namSanXuat, int dongCo, int soGhe) {
        this.hangXe = hangXe;
        this.setNamSanXuat(namSanXuat);
        this.setDongCo(dongCo);
        this.setSoGhe(soGhe);
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        int currentYear = Year.now().getValue();
        if (namSanXuat < 1829 || namSanXuat > currentYear) {
            System.out.println("Năm sản xuất không hợp lệ");
        } else {
            this.namSanXuat = namSanXuat;
        }
    }

    public int getDongCo() {
        return dongCo;
    }

    public void setDongCo(int dongCo) {
        if (dongCo >= 150 && dongCo <= 800) {
            this.dongCo = dongCo;
        } else {
            System.out.println("Công suất động cơ không hợp lệ, phải nằm trong khoảng 150 đến 800 mã lực");
        }
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        if (soGhe < 10 || soGhe > 100) {
            System.out.println("Số ghế không hợp lệ");
        } else {
            this.soGhe = soGhe;
        }
    }

    @Override
    public String toString() {
        if (namSanXuat == 0 || dongCo == 0 || soGhe == 0) {
            return "Xe Bus{" + "hãng xe=" + hangXe + '}';
        } else if (namSanXuat == 0) {
            return "Xe Bus{" + "hãng xe=" + hangXe + ", công suất động cơ=" + dongCo + ", số ghế=" + soGhe + '}';
        } else if (dongCo == 0) {
            return "Xe Bus{" + "hãng xe=" + hangXe + ", năm sản xuất=" + namSanXuat + ", số ghế=" + soGhe + '}';
        } else if (soGhe == 0) {
            return "Xe Bus{" + "hãng xe=" + hangXe + ", năm sản xuất=" + namSanXuat + ", công suất động cơ=" + dongCo + '}';
        } else {
            return "Xe Bus{" + "hãng xe=" + hangXe + ", năm sản xuất=" + namSanXuat + ", công suất động cơ=" + dongCo + ", số ghế=" + soGhe + '}';
        }
    }

}
