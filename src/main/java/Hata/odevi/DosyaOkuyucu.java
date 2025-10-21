package Hata.odevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuyucu {

    public static void readFile(String filePath) throws BosDosyaIstisnasi, FileNotFoundException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("Dosya bulunamadı: " + filePath);
        }

        Scanner scanner = new Scanner(file);
        if (!scanner.hasNextLine()) {
            scanner.close();
            throw new BosDosyaIstisnasi("Dosya boş: " + filePath);
        }

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
