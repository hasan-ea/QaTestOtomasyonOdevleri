package OOP.odevi;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String departmanAdi;
    private Personel takimLideri;
    private List<Personel> personelList = new ArrayList<>();
    private List<String> gorevler = new ArrayList<>();

    public Departman(String departmanAdi,Personel takimLideri) {
        this.departmanAdi = departmanAdi;
        this.takimLideri = takimLideri;
        this.personelList = personelList;
        this.gorevler = gorevler;
    }
    public void liderDegisimi (Personel yeniLideri) {
        this.takimLideri = yeniLideri;
        System.out.println("Yeni Takım Lideri adı--->" + yeniLideri.getName() + " soyadı--->" + yeniLideri.getSurname());
    }

    public void personelEkle (Personel e) {
        personelList.add(e);
        System.out.println("Personel eklendi. Adı: " + e.getName() + "  Soyadı:" + e.getSurname());
    }

    public void personelcikar (Personel c) {
        if (personelList.remove(c)) {
            System.out.println(c.getName() + " " + c.getSurname() + " departmandan çıkarıldı.");
        } else {
            System.out.println(c.getName() + " " + c.getSurname() + " departmanda bulunamadı.");
        }
    }

    public void gorevEkle(String gorev) {
        gorevler.add(gorev);
        System.out.println("Yeni görev eklendi: " + gorev);
    }

    public void gorevTamamla(int index) {
        if(index >= 0 && index < gorevler.size()) {
            String g = gorevler.get(index);
            gorevler.set(index, g + " (Tamamlandı)");
            System.out.println("Görev tamamlandı: " + g);
        } else {
            System.out.println("Geçersiz görev indeksi: " + index);
        }
    }

    public void departmanBilgiGoster() {
        System.out.println("Departman: " + departmanAdi);
        System.out.println("Takım Lideri: " + takimLideri.getName() + " " + takimLideri.getSurname());
        System.out.println("Personel Listesi:");
        for(Personel p : personelList) {
            System.out.println("- " + p.getName() + " " + p.getSurname());
        }
        System.out.println("Görevler:");
        for(String g : gorevler) {
            System.out.println("- " + g);
        }
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public Personel getTakimLideri() {
        return takimLideri;
    }

    public String getDepartmanAdi() {
        return departmanAdi;
    }



}