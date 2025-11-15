# Panduan Menambahkan JUnit Library di NetBeans

## Masalah

Error yang muncul:

```
The <classpath> or <modulepath> for <junit> must include junit.jar if not in Ant's own classpath
```

## Solusi: Menambahkan JUnit Library

### Langkah 1: Buka Project Properties

1. Klik kanan pada project **TR_PBO_testing** di NetBeans (di panel Projects)
2. Pilih **Properties**

### Langkah 2: Tambahkan JUnit Library

1. Di dialog Properties, pilih **Libraries** di kategori **Build**
2. Klik tab **Test Libraries** (penting: pastikan di tab Test Libraries, bukan Compile Libraries)
3. Klik tombol **Add Library...**
4. Di dialog "Add Library", pilih **JUnit**
5. Klik **Add Library**
6. Pilih versi JUnit:
   - **JUnit 4.13.2** (disarankan) atau
   - **JUnit 4.12** (alternatif)
7. Klik **OK** untuk menutup dialog Add Library
8. Klik **OK** untuk menutup dialog Properties

### Langkah 3: Verifikasi

1. Pastikan JUnit muncul di daftar Test Libraries
2. Coba jalankan test lagi dengan klik kanan pada file test → **Test**

## Alternatif: Download JUnit Manual

Jika JUnit tidak tersedia di daftar Add Library:

1. Download JUnit 4.13.2 dari: https://junit.org/junit4/
2. Download juga Hamcrest Core (diperlukan oleh JUnit):
   - https://mvnrepository.com/artifact/org.hamcrest/hamcrest-core
3. Di NetBeans:
   - Klik kanan project → **Properties**
   - Pilih **Libraries** → tab **Test Libraries**
   - Klik **Add JAR/Folder...**
   - Pilih file `junit-4.13.2.jar` yang sudah didownload
   - Klik **Add JAR/Folder...** lagi
   - Pilih file `hamcrest-core-1.3.jar` yang sudah didownload
   - Klik **OK**

## Catatan Penting

- **PENTING**: Pastikan JUnit ditambahkan di tab **Test Libraries**, bukan di tab **Compile Libraries**
- NetBeans memerlukan JUnit di Test Libraries untuk menjalankan test
- Jika masih error, coba:
  1. Clean and Build project (klik kanan project → **Clean and Build**)
  2. Restart NetBeans
  3. Pastikan tidak ada konflik antara JUnit 4 dan JUnit 5

## Verifikasi Setup

Setelah menambahkan JUnit, coba jalankan test sederhana:

1. Klik kanan pada `test/latihan/jdbc/model/UserTest.java`
2. Pilih **Test**
3. Jika berhasil, akan muncul hasil test di panel Test Results

Jika masih ada error, pastikan:

- JUnit 4 (bukan JUnit 5) yang digunakan
- Hamcrest Core juga ditambahkan
- Project sudah di-clean dan rebuild
