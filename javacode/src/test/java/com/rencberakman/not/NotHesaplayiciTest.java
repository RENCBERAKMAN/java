package com.rencberakman.not;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;//JUnit in tüm doğrulama(assert) metdodlarını kullanmamızı sağlar(assertEquals vb.)
public class NotHesaplayiciTest {
    @Test
    void testNotGecer() {
        NotHesaplayici hesap = new NotHesaplayici();
        double ort = hesap.ortalamaHesapla(70, 80, 90); // ortalama hesapla
        assertTrue(hesap.gectiMi(ort), "70-80-90 notlariyla ogrenci gecmeliydi!");
    }
    @Test
    void testNotKalir(){
        double ort = 50;
        NotHesaplayici hesap = new NotHesaplayici();
        boolean sonuc = hesap.gectiMi(ort);
        assertEquals(false, sonuc, "50 notu icin ogrenci kalmaliydi");
    }
    @Test
    void testNotTamSinirda(){
        double ort = 60;
        NotHesaplayici hesap = new NotHesaplayici();
        boolean sonuc = hesap.gectiMi(ort);
        assertEquals(true, sonuc, "60 ortalama icin ogrenci gecmeli");
    }
    @Test
    void testNotYuksek(){
        double ort = 95;
        NotHesaplayici hesap = new NotHesaplayici();
        boolean sonuc = hesap.gectiMi(ort);
        assertEquals(true, sonuc, "98 ortalama icin ogrenci gecmeli");
    }
    @Test
    void testNotSİfir(){
        double ort = 0;
        NotHesaplayici hesap = new NotHesaplayici();
        boolean sonuc = hesap.gectiMi(ort);
        assertEquals(false, sonuc, "0 ortalama icin ogrenci kalmaliydi");
    }
    @Test
    void testNotSinir60(){
        double ort = 60;
        NotHesaplayici hesap = new NotHesaplayici();
        boolean sonuc = hesap.gectiMi(ort);
        assertEquals(true, sonuc, "60 ortalama ile gecmeli");
    }
}