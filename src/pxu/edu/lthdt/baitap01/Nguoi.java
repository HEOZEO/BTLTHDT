package pxu.edu.lthdt.baitap01;

import java.time.LocalDate;

public class Nguoi {
    private String hoten;
    int namsinh;

    public Nguoi(String hoten, int namsinh) {
        this.setHoten(hoten);
        this.setNamsinh(namsinh);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        LocalDate ngayhientai = LocalDate.now();
        int namhientai = ngayhientai.getYear();
        if(namsinh>namhientai && namsinh<=1900){
            System.out.println("Nam sinh khong hop le");
        }else {
            this.namsinh = namsinh;
        }       
    }

    @Override
    public String toString() {
        return " Nguoi{" + "hoten = " + hoten + ", namsinh = " + namsinh ;  
    }
    
    
}