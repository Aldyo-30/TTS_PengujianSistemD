package latihan.jdbc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test untuk class Karyawan
 */
public class KaryawanTest {
    
    @Test
    public void testGetId() {
        Karyawan karyawan = new Karyawan();
        karyawan.setId(1);
        assertEquals(1, karyawan.getId());
    }
    
    @Test
    public void testSetId() {
        Karyawan karyawan = new Karyawan();
        karyawan.setId(50);
        assertEquals(50, karyawan.getId());
    }
    
    @Test
    public void testGetNama() {
        Karyawan karyawan = new Karyawan();
        karyawan.setNama("Karyawan Test");
        assertEquals("Karyawan Test", karyawan.getNama());
    }
    
    @Test
    public void testSetNama() {
        Karyawan karyawan = new Karyawan();
        karyawan.setNama("Nama Baru");
        assertEquals("Nama Baru", karyawan.getNama());
    }
    
    @Test
    public void testGetHp() {
        Karyawan karyawan = new Karyawan();
        karyawan.setHp("081234567890");
        assertEquals("081234567890", karyawan.getHp());
    }
    
    @Test
    public void testSetHp() {
        Karyawan karyawan = new Karyawan();
        karyawan.setHp("089876543210");
        assertEquals("089876543210", karyawan.getHp());
    }
    
    @Test
    public void testGetStats() {
        Karyawan karyawan = new Karyawan();
        karyawan.setStats("Aktif");
        assertEquals("Aktif", karyawan.getStats());
    }
    
    @Test
    public void testSetStats() {
        Karyawan karyawan = new Karyawan();
        karyawan.setStats("Nonaktif");
        assertEquals("Nonaktif", karyawan.getStats());
    }
    
    @Test
    public void testGetKelamin() {
        Karyawan karyawan = new Karyawan();
        karyawan.setKelamin("Laki-laki");
        assertEquals("Laki-laki", karyawan.getKelamin());
    }
    
    @Test
    public void testSetKelamin() {
        Karyawan karyawan = new Karyawan();
        karyawan.setKelamin("Perempuan");
        assertEquals("Perempuan", karyawan.getKelamin());
    }
    
    @Test
    public void testGetJabatan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setJabatan("Staff");
        assertEquals("Staff", karyawan.getJabatan());
    }
    
    @Test
    public void testSetJabatan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setJabatan("Manager");
        assertEquals("Manager", karyawan.getJabatan());
    }
    
    @Test
    public void testGetBulan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setBulan("01");
        assertEquals("01", karyawan.getBulan());
    }
    
    @Test
    public void testSetBulan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setBulan("12");
        assertEquals("12", karyawan.getBulan());
    }
    
    @Test
    public void testGetTanggal() {
        Karyawan karyawan = new Karyawan();
        karyawan.setTanggal("2024-01-15");
        assertEquals("2024-01-15", karyawan.getTanggal());
    }
    
    @Test
    public void testSetTanggal() {
        Karyawan karyawan = new Karyawan();
        karyawan.setTanggal("2024-12-25");
        assertEquals("2024-12-25", karyawan.getTanggal());
    }
    
    @Test
    public void testGetKeterangan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setKeterangan("Hadir");
        assertEquals("Hadir", karyawan.getKeterangan());
    }
    
    @Test
    public void testSetKeterangan() {
        Karyawan karyawan = new Karyawan();
        karyawan.setKeterangan("Izin");
        assertEquals("Izin", karyawan.getKeterangan());
    }
    
    @Test
    public void testAllProperties() {
        Karyawan karyawan = new Karyawan();
        karyawan.setId(1);
        karyawan.setNama("Karyawan Lengkap");
        karyawan.setHp("081234567890");
        karyawan.setStats("Aktif");
        karyawan.setKelamin("Laki-laki");
        karyawan.setJabatan("Staff");
        karyawan.setBulan("01");
        karyawan.setTanggal("2024-01-15");
        karyawan.setKeterangan("Hadir");
        
        assertEquals(1, karyawan.getId());
        assertEquals("Karyawan Lengkap", karyawan.getNama());
        assertEquals("081234567890", karyawan.getHp());
        assertEquals("Aktif", karyawan.getStats());
        assertEquals("Laki-laki", karyawan.getKelamin());
        assertEquals("Staff", karyawan.getJabatan());
        assertEquals("01", karyawan.getBulan());
        assertEquals("2024-01-15", karyawan.getTanggal());
        assertEquals("Hadir", karyawan.getKeterangan());
    }
}

