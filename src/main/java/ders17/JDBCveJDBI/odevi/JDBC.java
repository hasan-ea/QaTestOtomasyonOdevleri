package ders17.JDBCveJDBI.odevi;

import java.sql.*;

/**
 * Bu sınıf, Docker üzerinde çalışan yerel PostgreSQL veritabanına
 * JDBC kullanarak bağlanır ve PreparedStatement ile CRUD işlemlerini gerçekleştirir.
 */
public class JDBC {
    public static void main(String[] args) {


        // Veritabanı bağlantı bilgileri
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "emre";
        String password = "example";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            System.out.println("Bağlantı başarılı!");


            // 1) TABLO OLUŞTURMA
            /**
             * SQL sorgusu: Eğer ad_soyad tablosu yoksa oluşturur.
             * Tabloda id, ad, soyad ve departman alanları bulunur.
             */
            String createTableSQL =
                    "CREATE TABLE IF NOT EXISTS ad_soyad (" +
                            "id SERIAL PRIMARY KEY, " +
                            "ad VARCHAR(50), " +
                            "soyad VARCHAR(50), " +
                            "departman VARCHAR(50)" +
                            ")";

            try (PreparedStatement ps = conn.prepareStatement(createTableSQL)) {
                ps.executeUpdate();
                System.out.println("Tablo oluşturuldu (veya zaten vardı).");
            }


            // 2) INSERT – Veri ekleme
            /**
             * SQL insert sorgusu: ad, soyad ve departman bilgilerini tabloya ekler.
             * PreparedStatement kullanılması SQL enjeksiyonuna karşı güvenlidir.
             */
            String insertSQL = "INSERT INTO ad_soyad (ad, soyad, departman) VALUES (?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
                ps.setString(1, "Ali");
                ps.setString(2, "Demir");
                ps.setString(3, "IT");
                ps.executeUpdate();

                ps.setString(1, "Ayşe");
                ps.setString(2, "Yılmaz");
                ps.setString(3, "HR");
                ps.executeUpdate();

                System.out.println("2 adet kayıt eklendi.");
            }

            // 3) SELECT – Verileri okuma
            /**
             * SQL select sorgusu: Tablo içerisindeki tüm personel kayıtlarını listeler.
             */
            String selectSQL = "SELECT * FROM ad_soyad";

            try (PreparedStatement ps = conn.prepareStatement(selectSQL)) {
                ResultSet rs = ps.executeQuery();

                System.out.println("\n--- PERSONEL LISTESI ---");
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " | " +
                                    rs.getString("ad") + " | " +
                                    rs.getString("soyad") + " | " +
                                    rs.getString("departman")
                    );
                }
                System.out.println("------------------------\n");
            }


            // 4) DELETE – Veri silme
            /**
             * SQL delete sorgusu: Belirtilen ada sahip kaydı siler.
             * Burada 'Ali' adlı kayıt silinir.
             */
            String deleteSQL = "DELETE FROM ad_soyad WHERE ad = ?";

            try (PreparedStatement ps = conn.prepareStatement(deleteSQL)) {
                ps.setString(1, "Ali");
                int result = ps.executeUpdate();
                System.out.println("Silinen kayıt sayısı: " + result);
            }

        } catch (SQLException e) {
            /**
             * Veritabanı bağlantı hataları veya SQL çalıştırma hataları burada yakalanır.
             */
            e.printStackTrace();
        }
    }
}
