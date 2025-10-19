package OOP.odevi;

import java.time.LocalDate;

public class Erkek extends Personel {
    public Erkek(String name, String surname, LocalDate birthday) {
        super(name, surname, birthday);
    }

    @Override
    public void emeklilikHesabı() {
        int yas = 2025-getBirthday().getYear();
        int kalanyil = 65-yas;
        System.out.println("Emekli olmasına kalan yıl -----> " + kalanyil );
    }

}


