package com.rencberakman.not;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec;

        System.out.println("---------------MENU----------------");
        System.out.println("[1]-Ogrenci Not Hesaplama");
        System.out.println("[2]-Fahrenheit Hesaplama");
        System.out.println("[3]-Daire Alan Hesaplama");
        System.out.println("[4]-Faktoriyel Hesaplama");
        System.out.println("-----------------------------------");
        System.out.print("Lutfen bir secim yapiniz: ");
        sec = scanner.nextInt();

        switch (sec) {
            case 1:
                ogrenciNotHesapla(scanner);
                break;
            case 2:
                fahrenheithesapla(scanner);
                break;
            case 3:
                daireAlanHesapla(scanner);
                break;
            case 4:
                faktoriyelhesapla(scanner);
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }
    }

    private static void ogrenciNotHesapla(Scanner scanner) {
        scanner.nextLine(); // buffer temizleme
        System.out.print("Adiniz Nedir :");
        String adi = scanner.nextLine();
        System.out.print("Soyadiniz Nedir :");
        String soyadi = scanner.nextLine();
        System.out.print("Ders Adi Nedir :");
        String ders = scanner.nextLine();
        System.out.print("Vize Notunu Giriniz :");
        int vize = scanner.nextInt();
        System.out.print("Final Notunu Giriniz :");
        int finall = scanner.nextInt();
        System.out.print("Odev Notunu Giriniz :");
        int odev = scanner.nextInt();

        NotHesaplayici hesaplayici = new NotHesaplayici();
        double ort = hesaplayici.ortalamaHesapla(vize, finall, odev);

        System.out.println("Ders Adı: " + ders);
        if (hesaplayici.gectiMi(ort)) {
            System.out.printf("TEBRİKLER!!! %.2f ortalama ile geçtiniz\n", ort);
        } else {
            System.out.printf("MAALESEF %.2f ortalama ile kaldınız\n", ort);
        }
    }


    private static void fahrenheithesapla(Scanner scanner) {
        System.out.print("Sicaklik degerini giriniz :");
        int sicaklik = scanner.nextInt();

        FahrenheitHesaplayici hesaplayici = new FahrenheitHesaplayici();
        double fah = hesaplayici.fahrenheitHesapla(sicaklik);

        System.out.printf("Fahrenheit degeri : %.2f\n", fah);
    }

    private static void daireAlanHesapla(Scanner scanner) {
        System.out.print("Dairenin yarıçapını giriniz :");
        double yariCap = scanner.nextDouble();

        DaireAlanHesaplayici hesaplayici = new DaireAlanHesaplayici();
        double alan = hesaplayici.alanHesapla(yariCap);

        System.out.printf("Dairenin alanı : %.2f\n", alan);
    }

    private static void faktoriyelhesapla(Scanner scanner) {
        System.out.print("Bir sayi giriniz :");
        int sayi = scanner.nextInt();

        FaktoriyelHesaplayici hesaplayici = new FaktoriyelHesaplayici();
        long sonuc = hesaplayici.faktoriyelHesapla(sayi);

        System.out.printf("%d != : %d\n", sayi, sonuc);
    }
}
