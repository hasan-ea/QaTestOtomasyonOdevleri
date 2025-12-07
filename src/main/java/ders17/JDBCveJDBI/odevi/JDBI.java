package ders17.JDBCveJDBI.odevi;

import org.jdbi.v3.core.Jdbi;
import java.util.List;

/**
 * Uzak PostgreSQL veritabanında JDBI ile CRUD işlemlerini gösteren örnek sınıf.
 */
public class JDBI {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://pg-5bf848c-altnklbremre-fbe1.c.aivencloud.com:15063/defaultdb?sslmode=require";
        String user = "avnadmin";
        String password = "example";

        // JDBI bağlantısı
        Jdbi jdbi = Jdbi.create(url, user, password);

        // 1) Tablo oluşturma
        jdbi.useHandle(handle ->
                handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad (" +
                        "id SERIAL PRIMARY KEY, " +
                        "ad VARCHAR(50), " +
                        "soyad VARCHAR(50), " +
                        "departman VARCHAR(50)" +
                        ")")
        );

        // 2) Veri ekleme (3 kayıt)
        jdbi.useHandle(handle -> {
            handle.execute("INSERT INTO ad_soyad (ad, soyad, departman) VALUES (?, ?, ?)",
                    "Mehmet", "Kara", "IT");
            handle.execute("INSERT INTO ad_soyad (ad, soyad, departman) VALUES (?, ?, ?)",
                    "Zeynep", "Yıldız", "HR");
            handle.execute("INSERT INTO ad_soyad (ad, soyad, departman) VALUES (?, ?, ?)",
                    "Burak", "Demir", "Finans");
        });

        // 3) Veri listeleme
        List<String> list = jdbi.withHandle(handle ->
                handle.createQuery("SELECT id, ad, soyad, departman FROM ad_soyad")
                        .map((rs, ctx) ->
                                rs.getInt("id") + " | " +
                                        rs.getString("ad") + " | " +
                                        rs.getString("soyad") + " | " +
                                        rs.getString("departman"))
                        .list()
        );

        System.out.println("\n--- Uzak DB Kayıtları ---");
        list.forEach(System.out::println);

        // 4) Veri güncelleme
        jdbi.useHandle(handle ->
                handle.execute("UPDATE ad_soyad SET departman = ? WHERE ad = ?",
                        "Güncellendi", "Mehmet")
        );

        // 5) Veri silme (1 kayıt)
        jdbi.useHandle(handle ->
                handle.execute("DELETE FROM ad_soyad WHERE ad = ?", "Burak")
        );

        System.out.println("\nCRUD işlemleri tamamlandı.");


    }
}
