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
}