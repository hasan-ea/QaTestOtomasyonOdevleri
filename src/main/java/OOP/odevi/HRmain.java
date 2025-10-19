package OOP.odevi;

import java.util.List;

public class HRmain {
    public static void main(String[] args) {

        List<Personel> btPersoneller = PersonelData.getPersonelList();

        Personel baslangicLideri = btPersoneller.get(0);      //lider sıfır olmadığı için başlangıç lideri seçildi
        Departman btDepartmani = new Departman("BT", baslangicLideri);


        btDepartmani.personelEkle(btPersoneller.get(7));
        btDepartmani.personelEkle(btPersoneller.get(4));
        btDepartmani.personelEkle(btPersoneller.get(8));
        btDepartmani.personelEkle(btPersoneller.get(9));
        btDepartmani.personelEkle(btPersoneller.get(22));
        btDepartmani.personelEkle(btPersoneller.get(25));
        btDepartmani.personelEkle(btPersoneller.get(18));
        btDepartmani.personelEkle(btPersoneller.get(20));

        System.out.println("  ");

        btDepartmani.liderDegisimi(btPersoneller.get(3));

        System.out.println("  ");

        btDepartmani.gorevEkle("Aylık rapor hazırla");
        btDepartmani.gorevEkle("İşe alım süreci yönetimi");
        btDepartmani.gorevEkle("Personel performans değerlendirmesi");

        btDepartmani.gorevTamamla(0);

        System.out.println("  ");

        btDepartmani.departmanBilgiGoster();

        System.out.println("  ");

        System.out.println("--- Emeklilik Hesaplamaları ---");
        System.out.println("Takım Lideri:");
        btDepartmani.getTakimLideri().emeklilikHesabı();

        System.out.println("  ");

        System.out.println("Diğer Personeller:");
        for (Personel p : btDepartmani.getPersonelList()) {
            p.emeklilikHesabı();


        }

    }
}