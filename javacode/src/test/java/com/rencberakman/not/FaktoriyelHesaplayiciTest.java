package com.rencberakman.not;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaktoriyelHesaplayiciTest {

    @Test
    void testSifirFaktoriyel() {
        int sonuc = FaktoriyelHesaplayici.rencber(0);
        assertEquals(1, sonuc, "0! sonucu 1 olmalıydı!");
    }

    @Test
    void testBirFaktoriyel() {
        int sonuc = FaktoriyelHesaplayici.rencber(1);
        assertEquals(1, sonuc, "1! sonucu 1 olmalıydı!");
    }

    @Test
    void testBesFaktoriyel() {
        int sonuc = FaktoriyelHesaplayici.rencber(5);
        assertEquals(120, sonuc, "5! sonucu 120 olmalıydı!");
    }

    @Test
    void testNegatifFaktoriyel() {
        assertThrows(IllegalArgumentException.class, () -> {
            FaktoriyelHesaplayici.rencber(-3);
        }, "Negatif sayı için hata fırlatılmalıydı!");
    }
}
