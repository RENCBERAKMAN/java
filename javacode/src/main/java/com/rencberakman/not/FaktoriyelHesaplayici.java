package com.rencberakman.not;

public class FaktoriyelHesaplayici {

    public static int rencber(int sayi) {
        // 1) Girdi doğrulama
        if (sayi < 0) {
            throw new IllegalArgumentException("Negatif sayi icin faktoriyel tanimsiz!");
        }

        // 2) Hesaplama
        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
