package latihan.jdbc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test untuk class Admin
 */
public class AdminTest {
    
    @Test
    public void testGetId() {
        Admin admin = new Admin();
        admin.setId(1);
        assertEquals(1, admin.getId());
    }
    
    @Test
    public void testSetId() {
        Admin admin = new Admin();
        admin.setId(100);
        assertEquals(100, admin.getId());
    }
    
    @Test
    public void testGetNama() {
        Admin admin = new Admin();
        admin.setNama("Admin User");
        assertEquals("Admin User", admin.getNama());
    }
    
    @Test
    public void testSetNama() {
        Admin admin = new Admin();
        admin.setNama("Super Admin");
        assertEquals("Super Admin", admin.getNama());
    }
    
    @Test
    public void testGetPassword() {
        Admin admin = new Admin();
        admin.setPassword("admin123");
        assertEquals("admin123", admin.getPassword());
    }
    
    @Test
    public void testSetPassword() {
        Admin admin = new Admin();
        admin.setPassword("newadminpass");
        assertEquals("newadminpass", admin.getPassword());
    }
    
    @Test
    public void testGetStats() {
        Admin admin = new Admin();
        admin.setStats("Aktif");
        assertEquals("Aktif", admin.getStats());
    }
    
    @Test
    public void testSetStats() {
        Admin admin = new Admin();
        admin.setStats("Nonaktif");
        assertEquals("Nonaktif", admin.getStats());
    }
    
    @Test
    public void testGetHp() {
        Admin admin = new Admin();
        admin.setHp("081234567890");
        assertEquals("081234567890", admin.getHp());
    }
    
    @Test
    public void testSetHp() {
        Admin admin = new Admin();
        admin.setHp("081111111111");
        assertEquals("081111111111", admin.getHp());
    }
    
    @Test
    public void testGetKelamin() {
        Admin admin = new Admin();
        admin.setKelamin("Laki-laki");
        assertEquals("Laki-laki", admin.getKelamin());
    }
    
    @Test
    public void testSetKelamin() {
        Admin admin = new Admin();
        admin.setKelamin("Perempuan");
        assertEquals("Perempuan", admin.getKelamin());
    }
    
    @Test
    public void testGetJabaran() {
        Admin admin = new Admin();
        admin.setJabaran("Manager");
        assertEquals("Manager", admin.getJabaran());
    }
    
    @Test
    public void testSetJabaran() {
        Admin admin = new Admin();
        admin.setJabaran("Supervisor");
        assertEquals("Supervisor", admin.getJabaran());
    }
    
    @Test
    public void testAllProperties() {
        Admin admin = new Admin();
        admin.setId(1);
        admin.setNama("Admin Test");
        admin.setPassword("password");
        admin.setStats("Aktif");
        admin.setHp("081234567890");
        admin.setKelamin("Laki-laki");
        admin.setJabaran("Manager");
        
        assertEquals(1, admin.getId());
        assertEquals("Admin Test", admin.getNama());
        assertEquals("password", admin.getPassword());
        assertEquals("Aktif", admin.getStats());
        assertEquals("081234567890", admin.getHp());
        assertEquals("Laki-laki", admin.getKelamin());
        assertEquals("Manager", admin.getJabaran());
    }
}

