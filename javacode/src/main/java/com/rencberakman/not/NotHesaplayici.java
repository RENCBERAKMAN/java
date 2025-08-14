package com.rencberakman.not;
public class NotHesaplayici {
    public double ortalamaHesapla(int vize, int finall, int odev){
        return (finall * 0.50) + (vize * 0.30) + (odev * 0.20);
    }
    public boolean gectiMi(double ort) {
        return ort >=60;
    }
}