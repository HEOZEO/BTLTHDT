package edu.pxu.lthdt.bai03;

import java.time.Year;

public class XeOto {
    private String hangXe;
    private int namSanXuat;
    private int dongCo;

    public XeOto(String hangXe, int namSanXuat, int dongCo) {
        this.hangXe = hangXe;
        this.setNamSanXuat(namSanXuat);
        this.setDongCo(dongCo);
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

    @Override
    public String toString() {
        if (namSanXuat == 0 || dongCo == 0) {
            return "Xe Oto{" + "hãng xe=" + hangXe + '}';
        } else if (namSanXuat == 0) {
            return "Xe Oto{" + "hãng xe=" + hangXe + ", công suất động cơ=" + dongCo + '}';
        } else if (dongCo == 0) {
            return "Xe Oto{" + "hãng xe=" + hangXe + ", năm sản xuất=" + namSanXuat + '}';
        } else {
            return "Xe Oto{" + "hãng xe=" + hangXe + ", năm sản xuất=" + namSanXuat + ", công suất động cơ=" + dongCo + '}';
        }
    }

}
