package com.rencberakman.not;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner secim = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("[1]-Ogrenci Not Hesaplama");
        System.out.println("[2]-Fahrenheit Hesaplama");
        System.out.println("[A]-Faktoriyel Hesaplama");
        System.out.println("[B]-Daire alan Hesaplama");
        System.out.println("[C]-Dikdorgen alan hesaplama");
        System.out.println("--------------------------------------");
        System.out.print("Lutfen bir secim yapiniz :");
        String sec = secim.nextLine().trim().toUpperCase();

        switch (sec) {
            case "1":
                notHesaplayici(secim);
                break;
            case "2":
                fahrenheitHesaplayici(secim);
                break;
            case "A":
                faktoriyelHesaplayici(secim);
                break;
            case "B":
                daireAlanHesaplayici(secim);
                break;
            case "C":
                diktortgenAlanHesaplama(secim);
                break;
            default:
                System.out.print("Gecersiz karekter girdiniz lutfen yapmak istediginiz islemin yanındaki karekteri giriniz.");

        }

    }

    private static void notHesaplayici(Scanner secim) {

        System.out.print("Adiniz Nedir? :");
        String adi = secim.nextLine();

        System.out.print("Ders Adi Nedir? :");
        String ders = secim.nextLine();

        System.out.print("Vize Notunuz Nedir? :");
        int vize = secim.nextInt();

        System.out.print("Final Notunuz Nedir? :");
        int finall = secim.nextInt();

        System.out.print("Odev Notu Nedir? :");
        int odev = secim.nextInt();
        NotHesaplayici hesaplayici = new NotHesaplayici();
        double ort = hesaplayici.ortalamaHesapla(vize, finall, odev);
        if (ort < 60) {
            System.out.printf("%s calismadigin icin %s:Dersinden %.2f:Ortalama ile kaldin.", adi, ders, ort);
        } else {
            System.out.printf("%s basarilisin %s:Dersinden %.2f:Ortalama ile gectin Tebrikler", adi, ders, ort);
        }

    }
    private static void fahrenheitHesaplayici(Scanner secim){

        System.out.print("Sicaklik degerini giriniz :");
        double sicaklik = secim.nextDouble();
        double fah = FahrenheitHesaplayici.hesapla(sicaklik);
        System.out.printf("Fahrenheit degeri :%.2f",fah);
    }

    private static void faktoriyelHesaplayici(Scanner secim){
        System.out.print("Lutfen bir sayi giriniz :");
        int sayi = secim.nextInt();
        int sonuc = FaktoriyelHesaplayici.rencber(sayi);
        System.out.printf("Girdiginiz sayinin faktoriyeli %d! =%d",sayi,sonuc);
    }

    private static void daireAlanHesaplayici(Scanner secim){
        System.out.print("Lutfen dairenin yaricapini giriniz :");
        int yaricap = secim.nextInt();
        double alan = DaireAlanHesaplayici.rencberakman(yaricap);
        System.out.printf("Dairenin Alanı : %.2f",alan);
    }

    private static void diktortgenAlanHesaplama(Scanner secim){
        System.out.print("Diktorgenin kisa kenarini giriniz :"); int a = secim.nextInt();
        System.out.print("Diktortgenin uzun kenarini giriniz :");int b = secim.nextInt();
        int dikalan = DikdortgenAlanHesaplayici.dikhesap(a, b);
        System.out.printf("Diktorgenin alani : %d",dikalan);
    }

}

