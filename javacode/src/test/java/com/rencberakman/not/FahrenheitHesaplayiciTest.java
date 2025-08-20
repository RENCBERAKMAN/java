package com.rencberakman.not;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitHesaplayiciTest {

    @Test
    void testSifirCelsius() {
        double sonuc = FahrenheitHesaplayici.hesapla(0);
        assertEquals(32.0, sonuc, 0.0001, "0°C 32°F olmalıydı!");
    }

    @Test
    void testYuzCelsius() {
        double sonuc = FahrenheitHesaplayici.hesapla(100);
        assertEquals(212.0, sonuc, 0.0001, "100°C 212°F olmalıydı!");
    }

    @Test
    void testEksiKirkCelsius() {
        double sonuc = FahrenheitHesaplayici.hesapla(-40);
        assertEquals(-40.0, sonuc, 0.0001, "-40°C -40°F olmalıydı!");
    }

    @Test
    void testYirmiBesCelsius() {
        double sonuc = FahrenheitHesaplayici.hesapla(25);
        assertEquals(77.0, sonuc, 0.0001, "25°C 77°F olmalıydı!");
    }
}
