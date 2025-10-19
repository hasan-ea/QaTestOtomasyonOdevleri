package OOP.odevi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonelData {
    public static List<Personel> getPersonelList() {
        List<Personel> personeller = new ArrayList<>();

        personeller.add(new Erkek("Ahmet","Yılmaz", LocalDate.of(1980,5,15)));
        personeller.add(new Erkek("Mehmet","Kaya", LocalDate.of(1990,3,15)));
        personeller.add(new Erkek("Ali","Demir", LocalDate.of(1982,8,20)));
        personeller.add(new Erkek("Hayrullah","Öztürk", LocalDate.of(1995,12,1)));
        personeller.add(new Erkek("Cem","Aydın", LocalDate.of(1993,7,25)));
        personeller.add(new Erkek("Emre","Polat", LocalDate.of(1987,11,30)));
        personeller.add(new Erkek("Serkan","Çelik", LocalDate.of(1991,4,5)));
        personeller.add(new Erkek("Burak","Kara", LocalDate.of(1989,6,12)));
        personeller.add(new Erkek("Onur","Arslan", LocalDate.of(1984,2,28)));
        personeller.add(new Erkek("Hakan","Taş", LocalDate.of(1992,9,17)));
        personeller.add(new Erkek("Okan","Güneş", LocalDate.of(1986,1,9)));
        personeller.add(new Erkek("Yusuf","Kılıç", LocalDate.of(1994,10,3)));
        personeller.add(new Erkek("Tolga","Şahin", LocalDate.of(1983,5,21)));
        personeller.add(new Erkek("Engin","Yıldız", LocalDate.of(1988,7,19)));
        personeller.add(new Erkek("Levent","Demirtaş", LocalDate.of(1990,12,7)));
        personeller.add(new Kadin("Ayşe","Demir", LocalDate.of(1985,3,12)));
        personeller.add(new Kadin("Fatma","Yılmaz", LocalDate.of(1988,6,25)));
        personeller.add(new Kadin("Elif","Karyazı", LocalDate.of(1991,11,5)));
        personeller.add(new Kadin("Zeynep","Aydın", LocalDate.of(1983,2,28)));
        personeller.add(new Kadin("Merve","Polat", LocalDate.of(1990,9,10)));
        personeller.add(new Kadin("Selin","Öztürk", LocalDate.of(1987,8,19)));
        personeller.add(new Kadin("Derya","Çelik", LocalDate.of(1992,4,30)));
        personeller.add(new Kadin("Buse","Arslan", LocalDate.of(1989,12,15)));
        personeller.add(new Kadin("Gamze","Taş", LocalDate.of(1993,1,8)));
        personeller.add(new Kadin("Seda","Güneş", LocalDate.of(1986,7,3)));
        personeller.add(new Kadin("Esra","Kılıç", LocalDate.of(1994,10,21)));
        personeller.add(new Kadin("Ebru","Şahin", LocalDate.of(1984,5,6)));
        personeller.add(new Kadin("Gizem","Yıldız", LocalDate.of(1988,9,12)));
        personeller.add(new Kadin("Hilal","Demirtaş", LocalDate.of(1991,3,17)));
        personeller.add(new Kadin("Cansu","Kaya", LocalDate.of(1985,6,30)));

        return personeller;
    }
}
