package testng.ders18.odevi;

import Muhasebe.OperatorlerveKosullar.odevi.PrimHesabi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoDataProvider {

    // POZİTİF TESTLER
    @Test
    public void testMaas20() {
        int actual = PrimHesabi.hesapla(20);
        int expected = 40000;
        Assert.assertEquals(actual, expected, "20 gün için maaş hatalı hesaplandı!");
    }

    @Test
    public void testMaas25() {
        int actual = PrimHesabi.hesapla(25);
        int expected = 55000;
        Assert.assertEquals(actual, expected, "25 gün için maaş hatalı hesaplandı!");
    }

    @Test
    public void testMaas31() {
        int actual = PrimHesabi.hesapla(31);
        int expected = 85000;
        Assert.assertEquals(actual, expected, "31 gün için maaş hatalı hesaplandı!");
    }


    // NEGATİF TESTLER
    @Test
    public void testNegativeDay() {
        try {
            PrimHesabi.hesapla(-1);
            Assert.fail("Negatif değer girilince exception fırlatılmalıydı!");
        } catch (IllegalArgumentException e) {
            // Başarılı → exception beklendi
        }
    }

    @Test
    public void testDayGreaterThan31() {
        try {
            PrimHesabi.hesapla(32);
            Assert.fail("32 günü kabul etmemeli ve exception fırlatmalı!");
        } catch (IllegalArgumentException e) {
        }
    }
}
