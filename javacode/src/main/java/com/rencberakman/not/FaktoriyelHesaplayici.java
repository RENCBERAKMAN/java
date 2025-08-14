package com.rencberakman.not;
public class FaktoriyelHesaplayici {
    public static  int rencber(int sayi){
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++){
            sonuc*=i;
        }
        return sonuc;
    }
}