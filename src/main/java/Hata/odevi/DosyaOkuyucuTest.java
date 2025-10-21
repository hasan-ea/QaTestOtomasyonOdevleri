package Hata.odevi;

import java.io.FileNotFoundException;


public class DosyaOkuyucuTest {
    public static void main(String[] args) {
        String nonExistentFile = "olmayanDosya.txt";
        String emptyFile = "bosDosya.txt";

        try {
            DosyaOkuyucu.readFile(nonExistentFile);
        } catch (FileNotFoundException e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        } catch (BosDosyaIstisnasi e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        }


        try {
            DosyaOkuyucu.readFile(emptyFile);
        } catch (FileNotFoundException e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        } catch (BosDosyaIstisnasi e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        }


    }
}