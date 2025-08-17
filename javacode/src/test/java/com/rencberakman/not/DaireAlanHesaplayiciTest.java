package com.rencberakman.not;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 public class DaireAlanHesaplayiciTest {
     @Test
     void testAlanPozitifSayi(){
         int yaricap = 5;
         double sonuc = DaireAlanHesaplayici.rencberakman(yaricap);
         assertEquals(78.5375, sonuc, 0.0001,
                 "Yaricap 5 icin alan yalnis hesaplandi !");
     }

     @Test
      void testAlanSifir(){
         int yaricap = 0;
         double sonuc = DaireAlanHesaplayici.rencberakman(yaricap);
         assertEquals(0.0, sonuc, 0.0001,
                 "yaricap 0 icin alan 0 olmaliydi");
     }
     @Test
     void testAlanNegatifYaricap(){
         int yaricap = -5;
         assertThrows(IllegalArgumentException.class, () -> {
             DaireAlanHesaplayici.rencberakman(yaricap);
         }, "Negatif yaricap icin hata firlatilamliydi!");
     }

     @Test
     void testAlanBuyukSayi(){
         int yaricap = 1000000;
         double sonuc = DaireAlanHesaplayici.rencberakman(yaricap);
         assertTrue(sonuc > 0, "Buyuk yaricap icin alan pozitif olmali!");
     }
}