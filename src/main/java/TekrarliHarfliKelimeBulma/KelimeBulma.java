package TekrarliHarfliKelimeBulma;
import java.util.*;

public class KelimeBulma {
    public static void main(String[] args) {
        String[] liste = {
                "Mümtazami",
                "toplu",
                "katip",
                "okul",
                "kahvehane",
                "baklava",
                "kırmızı",
                "toplu",
                "mümtazam",
                "sihat",
                "araba",
                "okul",
                "kavak",
                "Kitaplık",
                "meyveler",
                "Kahvehane"
        };


// Liste bezersizleştirildi
        ArrayList<String> miniListe = new ArrayList<>();
        for (String kelime : liste) {
            miniListe.add(kelime.toLowerCase());
        }
        ArrayList<String> kelimeler = new ArrayList<>(new LinkedHashSet<>((miniListe)));
        System.out.println("Kelimeler:                         " + kelimeler);



// döngülerle tekrarlı harf içeren kelimeler bulundu
        ArrayList<String> bulunankelimeler = new ArrayList<>();

        for (int i = 0; i < kelimeler.size(); i++) {
            String kelime = kelimeler.get(i);
            boolean tekrarvar = false;

            for (int j = 0; j < kelime.length(); j++) {
                for (int k = j + 1; k < kelime.length(); k++) {
                    if (kelime.charAt(j) == kelime.charAt(k)) {
                        tekrarvar = true;
                        break;
                    }
                }if (tekrarvar) break ;
            }if (tekrarvar)
                bulunankelimeler.add(kelime);

            if (bulunankelimeler.size() == 2)
                break;
        } System.out.println("Tekrarlı harf içeren ilk 2 kelime: " + bulunankelimeler);



//listede kelime bulunmadığı durumda uyarı eklendi
        if (bulunankelimeler.size() < 2) {
            System.out.println("!!UYARI!! === 2'den az tekrarlı harf içeren kelime bulundu");
            return;
        }



// Bulunan kelimlerden benzersiz harfler listesi oluşturuldu
        HashSet<Character> harfler  = new HashSet<>() ;

        for (String degerlikelime: bulunankelimeler ) {
            for (char harf : degerlikelime.toCharArray() ) {
                harfler.add(harf);
            }
        } System.out.println("Benzersiz Harfler:                 " + harfler);



//Hashset olan liste random sıralanması için arrayliste çevrildi
        ArrayList<Character> harflerList = new ArrayList<>(harfler);
        Collections.shuffle(harflerList);



//Harflerden kelime türetildi
        String rastgelekelime = "";
        for (Character x : harflerList  ) {
            rastgelekelime = rastgelekelime + x;
        } System.out.println("Oluşturulan metin:                 "+rastgelekelime);
    }
}
