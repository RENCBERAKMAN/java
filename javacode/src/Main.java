import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sec;
        System.out.println("---------------MENU----------------");
        System.out.println("[1]-Ogrenci Not Hesaplama");
        System.out.println("[2]-Fahrenheit Hesaplama");
        System.out.println("[3]-Daire Alan Hesaplama");
        System.out.println("[4]-Faktoriyel Hesaplama");
        System.out.println("-----------------------------------");

        Scanner secim = new Scanner(System.in);
        System.out.println("Lutfen bir secim yapiniz");
        sec = secim.nextInt();

        if (sec == 1) {
            ogrenciNotHesapla();
        }
    }

    public static void ogrenciNotHesapla() {
        Scanner scanner = new Scanner(System.in);
        String adi, soyadi, ders;
        int vize, finall, odev;
        double ort;

        System.out.print("Adiniz Nedir :"); adi = scanner.nextLine();
        System.out.print("Soyadiniz Nedir :"); soyadi = scanner.nextLine();
        System.out.print("Ders Adi Nedir :"); ders = scanner.nextLine();
        System.out.print("Vize Notunu Giriniz :"); vize = scanner.nextInt();
        System.out.print("Final Notunu Giriniz :"); finall = scanner.nextInt();
        System.out.print("Odev Notunu Giriniz :"); odev = scanner.nextInt();

        ort = (finall * 0.50) + (vize * 0.30) + (odev * 0.20);

        if (ort < 60) {
            System.out.println("Ders Adı: " + ders);
            System.out.printf("MAALESEF %.2f ortalama ile kaldınız\n", ort);
        } else {
            System.out.println("Ders Adı: " + ders);
            System.out.printf("TEBRİKLER!!! %.2f ortalama ile geçtiniz\n", ort);
        }
    }
}
