package com.rencberakman.not;
public class DaireAlanHesaplayici {
    public static double rencberakman(int yaricap){

        if (yaricap < 0) {
            throw new IllegalArgumentException("Yaricap negatif olamaz!");
        }
        double pii =3.1415;
        double alan = pii * yaricap *yaricap;

        return alan;
    }
}