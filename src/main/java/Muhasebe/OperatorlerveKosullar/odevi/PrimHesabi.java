package Muhasebe.OperatorlerveKosullar.odevi;

import java.util.Scanner;

public class PrimHesabi {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışanın gün bilgisini giriniz:");
        int day = input.nextInt();

        if (day < 0 || day > 31) {
            System.out.println("çalışan aylık çalıştığı gün sayısı 31 den büyük olamaz ve negatif olamaz");
            System.exit(0);
        }

        int maas = hesapla(day);
        System.out.println("Çalışanın toplam maaşı= " + maas + " TL'dir");
    }

    public static int hesapla(int day) {
        if (day < 0 || day > 31) {
            throw new IllegalArgumentException("Gün aralığı 0-31 olmalıdır");
        }
        int prim;
        if (day <= 20) prim = 0;
        else if (day <= 25) prim = (day - 20) * 1000;
        else prim = (day - 25) * 3000 + 5000;

        return (day * 2000) + prim;
    }
}
