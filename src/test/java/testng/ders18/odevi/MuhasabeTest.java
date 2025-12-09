package testng.ders18.odevi;

import Muhasebe.OperatorlerveKosullar.odevi.PrimHesabi;
import org.testng.Assert;
import org.testng.annotations.*;

public class MuhasabeTest {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\n--- SUITE BAŞLIYOR ---\n");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("--- TEST SETİ BAŞLIYOR ---\n");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(">> PrimHesabi Test Sınıfı Başlatıldı.\n");
    }

    @BeforeMethod
    public void beforeMethod(Object[] data) {
        System.out.println("---- Yeni Test Başlıyor ----");
        if (data != null && data.length > 0) {
            System.out.println("Girdi (day): " + data[0]);
        }
    }

    // ======================= DATA PROVIDER =======================

    @DataProvider(name = "bvaData")
    public Object[][] bvaData() {
        return new Object[][]{

                // BOUNDARY ANALYSIS
                // 0 Noktası
                {-1, 0, false},

                {0, 0, true},
                {1, 2000, true},

                // 20 Noktası
                {19, 38000, true},
                {20, 40000, true},
                {21, 43000, true},

                // 25 Noktası
                {24, 52000, true},
                {25, 55000, true},
                {26, 60000, true},

                // 31 Noktası
                {30, 80000, true},
                {31, 85000, true},

                {32, 0, false},

                // NEGATİF TESTLER (expected yanlış veriliyor)
                {20, 30000, false},
                {21, 42000, false},
                {24, 48000, false},
                {25, 60000, false},
                {26, 55000, false},
                {31, 90000, false},
                {33, 0, false}
        };
    }


    // ======================= TEST METODU  =======================

    @Test(dataProvider = "bvaData")
    public void testHesapla(int day, int expectedMaas, boolean expectedSuccess) {

        System.out.println("Beklenen Maas: " + expectedMaas + " | Beklenen Başarı: " + expectedSuccess);

        // ================= NEGATIF TESTLER =================
        if (!expectedSuccess) {

            // 1) GEÇERSİZ GİRİŞ ,EXCEPTION BEKLENİR
            if (day < 0 || day > 31) {
                System.out.println("Geçersiz giriş => exception bekleniyor");

                try {
                    PrimHesabi.hesapla(day);
                    Assert.fail("BEKLENEN exception fırlatılmadı!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Exception doğru şekilde fırlatıldı!");
                }

                return; // negatif test tamamlandı
            }

            // 2) GEÇERLİ GİRİŞ AMA YANLIŞ EXPECTED VERİLDİ
            int actual = PrimHesabi.hesapla(day);

            if (actual == expectedMaas) {
                Assert.fail("NEGATIF test başarısız! (Actual ve expected eşit olmamalıydı)");
            }

            System.out.println("Negatif Test Başarılı (Actual != Expected)");
            return;
        }

        // ================= POZITIF TESTLER =================
        int actual = PrimHesabi.hesapla(day);

        Assert.assertEquals(actual, expectedMaas, "Pozitif test FAILED => hesaplanan maaş beklenenle eşleşmiyor!");

        System.out.println("Pozitif Test PASS => Actual Maas: " + actual);
    }


    // ======================= KAPANIŞ BLOKLARI =======================

    @AfterMethod
    public void afterMethod() {
        System.out.println("---- Test Bitti ----\n");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("<< PrimHesabi Test Sınıfı Tamamlandı.\n");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("--- TEST SETİ BİTTİ ---\n");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("--- SUITE BİTTİ ---\n");
    }



}
