# Panduan Testing

File-file test telah dibuat untuk semua model dan controller classes. Untuk menjalankan test, pastikan library JUnit sudah ditambahkan ke project.

## Cara Menambahkan JUnit Library di NetBeans

1. Klik kanan pada project **TR_PBO** di NetBeans
2. Pilih **Properties**
3. Pilih **Libraries** di kategori **Build**
4. Klik **Add Library...**
5. Pilih **JUnit** dan klik **Add Library**
6. Pilih versi JUnit (disarankan JUnit 4.13.2 atau yang lebih baru)
7. Klik **OK**

## Struktur Test

### Model Tests
- `UserTest.java` - Test untuk class User (getter/setter)
- `AdminTest.java` - Test untuk class Admin (getter/setter)
- `KaryawanTest.java` - Test untuk class Karyawan (getter/setter)

### Controller Tests
- `LoginControllerTest.java` - Test untuk LoginController (cekLogin, cekLoginKaryawan, signupKaryawan)
- `UserControllerTest.java` - Test untuk UserController (tambahUser, tampilkanUser, createTable)
- `AdminControllerTest.java` - Test untuk AdminController (CRUD karyawan dan absen)
- `KoneksiTest.java` - Test untuk Koneksi (config database)

### Test Suite
- `AllTests.java` - Test suite untuk menjalankan semua test sekaligus

## Menjalankan Test

### Melalui NetBeans:
1. Klik kanan pada file test atau folder test
2. Pilih **Test** atau **Run Tests**
3. Untuk menjalankan semua test sekaligus, klik kanan pada `AllTests.java` dan pilih **Test**

### Melalui Command Line:
```bash
# Compile test files
javac -cp "path/to/junit.jar:path/to/hamcrest-core.jar:build/classes" test/latihan/jdbc/**/*.java

# Run single test
java -cp "path/to/junit.jar:path/to/hamcrest-core.jar:build/classes:test" org.junit.runner.JUnitCore latihan.jdbc.model.UserTest

# Run all tests (test suite)
java -cp "path/to/junit.jar:path/to/hamcrest-core.jar:build/classes:test" org.junit.runner.JUnitCore latihan.jdbc.AllTests
```

## Catatan Penting

1. **Database Connection**: Beberapa test memerlukan koneksi database. Pastikan:
   - MySQL server berjalan
   - Database `dbabsen` sudah dibuat
   - Tabel-tabel yang diperlukan sudah ada (tbadmin, tbkaryawan, tblistkaryawan, tbabsen)

2. **Test yang Bergantung pada Database**: Test untuk controller classes mungkin akan skip jika database tidak tersedia. Ini normal dan tidak berarti test gagal.

3. **Test Data**: Beberapa test menggunakan data dummy. Pastikan tidak ada konflik dengan data yang sudah ada di database.

## Coverage

Test mencakup:

### Model Classes (100% Coverage)
- ✅ **UserTest**: 10 test cases untuk semua getter/setter (id, nama, hariAbsen, status, password)
- ✅ **AdminTest**: 13 test cases untuk semua getter/setter (id, nama, password, stats, hp, kelamin, jabaran)
- ✅ **KaryawanTest**: 17 test cases untuk semua getter/setter (id, nama, hp, stats, kelamin, jabatan, bulan, tanggal, keterangan)

### Controller Classes
- ✅ **LoginControllerTest**: 9 test cases
  - Constructor test
  - cekLogin dengan kredensial valid/invalid/kosong
  - cekLoginKaryawan dengan kredensial valid/invalid/kosong
  - signupKaryawan dengan data valid/kosong/null
  
- ✅ **UserControllerTest**: 9 test cases
  - Constructor test
  - createTable (validasi struktur tabel)
  - tampilkanUser dengan nama valid/kosong/null
  - tambahUser dengan data valid/tanggal kosong/null/format tidak valid
  
- ✅ **AdminControllerTest**: 15 test cases
  - Constructor test
  - createTable dan Absen (validasi struktur tabel)
  - tampilkanKaryawan dan tampilAbsensi
  - tambahKaryawan dengan data valid/kosong
  - cariBulan dengan nilai valid/tidak valid
  - ubahAbsen dan ubahKaryawan dengan ID valid/tidak valid
  - hapusKaryawan dan hapusAbsen dengan ID valid/tidak valid
  
- ✅ **KoneksiTest**: 3 test cases
  - Test koneksi database
  - Test multiple connections
  - Test connection properties

### Total Test Cases: **76 test cases**

## Detail Test Cases

### Model Tests
Semua model classes memiliki test untuk:
- Getter methods
- Setter methods
- Kombinasi semua properties

### Controller Tests
Controller tests mencakup:
- Constructor initialization
- Method validasi (null check, empty string check)
- Method CRUD operations (Create, Read, Update, Delete)
- Method query dan display data
- Error handling dan edge cases
- Format validation (tanggal, dll)

