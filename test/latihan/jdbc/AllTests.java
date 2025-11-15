package latihan.jdbc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import latihan.jdbc.model.UserTest;
import latihan.jdbc.model.AdminTest;
import latihan.jdbc.model.KaryawanTest;
import latihan.jdbc.controller.LoginControllerTest;
import latihan.jdbc.controller.UserControllerTest;
import latihan.jdbc.controller.AdminControllerTest;
import latihan.jdbc.controller.KoneksiTest;

/**
 * Test Suite untuk menjalankan semua unit test sekaligus
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    // Model Tests
    UserTest.class,
    AdminTest.class,
    KaryawanTest.class,
    
    // Controller Tests
    LoginControllerTest.class,
    UserControllerTest.class,
    AdminControllerTest.class,
    KoneksiTest.class
})
public class AllTests {
    // Class ini hanya sebagai container untuk test suite
}

