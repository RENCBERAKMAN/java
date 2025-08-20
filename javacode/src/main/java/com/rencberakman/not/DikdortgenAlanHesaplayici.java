package com.rencberakman.not;

public class DikdortgenAlanHesaplayici {

    public static int dikhesap(int a, int b) {
        // Kenar uzunlukları negatif olamaz, kontrol edelim
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Kenar uzunluğu negatif olamaz!");
        }

        // Alanı hesapla
        return a * b;
    }
}
