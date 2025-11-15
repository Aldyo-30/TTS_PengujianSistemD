package latihan.jdbc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test untuk class User
 */
public class UserTest {
    
    @Test
    public void testGetId() {
        User user = new User();
        user.setId(1);
        assertEquals(1, user.getId());
    }
    
    @Test
    public void testSetId() {
        User user = new User();
        user.setId(5);
        assertEquals(5, user.getId());
    }
    
    @Test
    public void testGetNama() {
        User user = new User();
        user.setNama("John Doe");
        assertEquals("John Doe", user.getNama());
    }
    
    @Test
    public void testSetNama() {
        User user = new User();
        user.setNama("Jane Doe");
        assertEquals("Jane Doe", user.getNama());
    }
    
    @Test
    public void testGetHariAbsen() {
        User user = new User();
        user.setHariAbsen("2024-01-15");
        assertEquals("2024-01-15", user.getHariAbsen());
    }
    
    @Test
    public void testSetHariAbsen() {
        User user = new User();
        user.setHariAbsen("2024-12-25");
        assertEquals("2024-12-25", user.getHariAbsen());
    }
    
    @Test
    public void testGetStatus() {
        User user = new User();
        user.setStatus("Hadir");
        assertEquals("Hadir", user.getStatus());
    }
    
    @Test
    public void testSetStatus() {
        User user = new User();
        user.setStatus("Izin");
        assertEquals("Izin", user.getStatus());
    }
    
    @Test
    public void testGetPassword() {
        User user = new User();
        user.setPassword("password123");
        assertEquals("password123", user.getPassword());
    }
    
    @Test
    public void testSetPassword() {
        User user = new User();
        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());
    }
    
    @Test
    public void testAllProperties() {
        User user = new User();
        user.setId(10);
        user.setNama("Test User");
        user.setHariAbsen("2024-01-01");
        user.setStatus("Hadir");
        user.setPassword("testpass");
        
        assertEquals(10, user.getId());
        assertEquals("Test User", user.getNama());
        assertEquals("2024-01-01", user.getHariAbsen());
        assertEquals("Hadir", user.getStatus());
        assertEquals("testpass", user.getPassword());
    }
}

