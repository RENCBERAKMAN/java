package com.rencberakman.not;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DikdortgenAlanHesaplayiciTest {

    @Test
    void testAlanPozitifSayilar() {
        int a = 5;
        int b = 10;
        int sonuc = DikdortgenAlanHesaplayici.dikhesap(a, b);
        assertEquals(50, sonuc, "5x10 dikdörtgenin alanı 50 olmalı!");
    }

    @Test
    void testAlanSifirKenar() {
        int a = 0;
        int b = 7;
        int sonuc = DikdortgenAlanHesaplayici.dikhesap(a, b);
        assertEquals(0, sonuc, "Bir kenar 0 ise alan 0 olmalı!");
    }

    @Test
    void testAlanNegatifKenar() {
        assertThrows(IllegalArgumentException.class, () -> {
            DikdortgenAlanHesaplayici.dikhesap(-5, 10);
        }, "Negatif kenar için hata fırlatılmalıydı!");
    }

    @Test
    void testAlanBuyukSayilar() {
        int a = 10000;
        int b = 20000;
        int sonuc = DikdortgenAlanHesaplayici.dikhesap(a, b);
        assertTrue(sonuc > 0, "Büyük kenarlar için alan pozitif olmalı!");
    }
}
