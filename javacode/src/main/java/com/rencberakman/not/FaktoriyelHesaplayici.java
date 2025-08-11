package com.rencberakman.not;

public class FaktoriyelHesaplayici {

    public long faktoriyelHesapla(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
