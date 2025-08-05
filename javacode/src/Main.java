import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   int odev,vize,finall;
   double ort;
   Scanner bilgiler = new Scanner(System.in);
   System.out.println("Odev notunu giriniz :");odev = bilgiler.nextInt();
   System.out.println("Vize notunu giriniz :");vize = bilgiler.nextInt();
   System.out.println("Final notunu giriniz:");finall = bilgiler.nextInt();
   ort = (odev*0.20)+(vize*0.30)+(finall*0.50);
   if (ort <=60){
     System.out.println(ort + ":Ortalama ile kaldiniz");
   }
   else {
     System.out.println(ort +":Ortalama ile gectiniz :");
   }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                              //|| : Veya                            //% : Mod alma        //a++ :Artırma
                             // != :Eşit değil                      //== : Eşitlik        //b-- :Eksiltme
                            //!(a&&b) :Değil                       //&& : ve
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        }
    }
