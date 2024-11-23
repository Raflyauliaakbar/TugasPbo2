package Latihan3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    // Path absolut ke file SQLite
    private static final String URL = "jdbc:sqlite:C:/Users/SSD TURBO_BC/Documents/NetBeansProjects/TugasPbo/src/Latihan3/kontak.db";
    
    // Metode untuk mendapatkan koneksi ke database
    public static Connection connect() {
        Connection conn = null;
        try {
            // Register driver SQLite
            Class.forName("org.sqlite.JDBC");
            // Membuka koneksi
            conn = DriverManager.getConnection(URL);
            System.out.println("Koneksi ke database berhasil.");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver SQLite tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Gagal terhubung ke database: " + e.getMessage());
        }
        return conn;
    }

    // Metode untuk membuat tabel kontak jika belum ada
    public static void createTable() {
        String createTableQuery = """
                CREATE TABLE IF NOT EXISTS kontak (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nama TEXT NOT NULL,
                    nomor_telepon TEXT NOT NULL,
                    kategori TEXT NOT NULL
                );
                """;
        try (Connection conn = connect(); 
             java.sql.Statement stmt = conn.createStatement()) {
            stmt.execute(createTableQuery);
            System.out.println("Tabel kontak berhasil dibuat atau sudah ada.");
        } catch (SQLException e) {
            System.err.println("Gagal membuat tabel: " + e.getMessage());
        }
    }

    // Tes koneksi dan buat tabel
    public static void main(String[] args) {
        Connection conn = connect();
        if (conn != null) {
            System.out.println("Koneksi berhasil!");
            createTable(); // Panggil metode untuk membuat tabel
        } else {
            System.out.println("Koneksi gagal!");
        }
    }
}
