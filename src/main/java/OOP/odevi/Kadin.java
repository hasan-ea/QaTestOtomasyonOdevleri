package OOP.odevi;

import java.time.LocalDate;

public class Kadin extends Personel {
    public Kadin(String name, String surname, LocalDate birthday) {
        super(name, surname, birthday);
    }

    @Override
    public void emeklilikHesabı() {
        int yas = 2025-getBirthday().getYear();
        int kalanyil = 60-yas;
        System.out.println("Emekli olmasına kalan yıl -----> " + kalanyil );
    }
}
