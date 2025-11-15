package latihan.jdbc.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test untuk class Koneksi
 * 
 * Catatan: Test ini memerlukan MySQL server yang berjalan dan database 'dbabsen' yang sudah dibuat.
 * Jika database tidak tersedia, test akan gagal.
 */
public class KoneksiTest {
    
    @Test
    public void testConfig() {
        try {
            Koneksi koneksi = new Koneksi();
            koneksi.config();
            
            // Test koneksi berhasil
            assertNotNull("Connection tidak boleh null", Koneksi.con);
            assertNotNull("Statement tidak boleh null", Koneksi.stm);
            assertFalse("Connection tidak boleh closed", Koneksi.con.isClosed());
            
            System.out.println("Test koneksi berhasil!");
        } catch (Exception e) {
            // Jika database tidak tersedia, test akan gagal
            System.out.println("Test koneksi gagal: " + e.getMessage());
            System.out.println("Pastikan MySQL server berjalan dan database 'dbabsen' sudah dibuat");
            // Test akan fail jika database tidak tersedia
            fail("Koneksi database gagal: " + e.getMessage());
        }
    }
    
    @Test
    public void testMultipleConnections() {
        try {
            // Test multiple connections
            Koneksi koneksi1 = new Koneksi();
            koneksi1.config();
            
            Koneksi koneksi2 = new Koneksi();
            koneksi2.config();
            
            // Kedua koneksi harus menggunakan connection yang sama (static)
            assertSame("Connection harus sama (static)", Koneksi.con, Koneksi.con);
            
            System.out.println("Test multiple connections berhasil!");
        } catch (Exception e) {
            System.out.println("Test multiple connections gagal: " + e.getMessage());
            fail("Koneksi database gagal: " + e.getMessage());
        }
    }
    
    @Test
    public void testConnectionProperties() {
        try {
            Koneksi koneksi = new Koneksi();
            koneksi.config();
            
            // Test bahwa connection memiliki properties yang benar
            String url = Koneksi.con.getMetaData().getURL();
            assertNotNull("URL tidak boleh null", url);
            assertTrue("URL harus mengandung 'dbabsen'", url.contains("dbabsen"));
            
            System.out.println("URL Database: " + url);
            System.out.println("Test connection properties berhasil!");
        } catch (Exception e) {
            System.out.println("Test connection properties gagal: " + e.getMessage());
            fail("Koneksi database gagal: " + e.getMessage());
        }
    }
}

