# Tugas PBO - Simulasi Program ATM Sederhana (Java)

Repositori ini berisi program ATM sederhana berbasis Java untuk mendemonstrasikan konsep **Pemrograman Berorientasi Objek (PBO)**, hubungan antarkelas, serta penggunaan `ArrayList` untuk mengelola nasabah dan rekening.

Program menyediakan menu untuk memilih nasabah, mengecek saldo, melakukan setor tunai, tarik tunai, dan transfer ke rekening nasabah lainnya.

## 📁 Struktur Repositori

```text
Tugas_PBO_Array_dan_ArrayList/
├── program_output/
│   └── Screenshot 2026-10-07 130909.png
└── src/
    ├── Account.java   # Mengelola saldo dan transaksi rekening
    ├── Bank.java      # Mengelola daftar nasabah
    ├── Customer.java  # Menyimpan identitas nasabah dan rekeningnya
    └── Main.java      # Menjalankan program dan menampilkan menu ATM
```

## 🛠️ Penjelasan Kelas yang Digunakan

Program dibagi menjadi beberapa kelas yang masing-masing bertanggung jawab atas data nasabah, rekening, pengelolaan bank, dan interaksi dengan pengguna.

### 1. `Account.java`

Kelas ini mengelola saldo dan transaksi pada satu rekening.

- **Atribut:**
  - `balance` (`double`): saldo rekening yang disimpan secara privat.
- **Method:**
  - `getBalance()`: mengembalikan saldo saat ini.
  - `deposit(double amount)`: menambahkan setoran jika jumlahnya lebih dari nol dan mengembalikan status berhasil atau tidak.
  - `withdraw(double amount)`: mengurangi saldo jika jumlahnya lebih dari nol dan saldo mencukupi.
  - `transfer(Account tujuan, double amount)`: memindahkan saldo ke rekening tujuan jika tujuan tersedia, jumlahnya lebih dari nol, dan saldo mencukupi.

### 2. `Bank.java`

Kelas ini mengelola daftar nasabah menggunakan `ArrayList<Customer>`.

- **Method:**
  - `addCustomer(String firstName, String lastName)`: membuat dan menambahkan nasabah ke daftar.
  - `getCustomer(int index)`: mengambil nasabah berdasarkan indeks; mengembalikan `null` jika indeks tidak valid.
  - `getNumOfCustomers()`: mengembalikan jumlah nasabah.

### 3. `Customer.java`

Kelas ini merepresentasikan nasabah beserta rekening-rekening yang dimilikinya.

- **Atribut:**
  - `firstName` dan `lastName` (`String`): nama depan dan nama belakang nasabah.
  - `accounts` (`ArrayList<Account>`): daftar rekening milik nasabah.
- **Method:**
  - `getFirstName()` dan `getLastName()`: mengambil nama depan dan nama belakang.
  - `getFullName()`: menggabungkan nama depan dan nama belakang.
  - `setAccount(Account account)`: menambahkan rekening ke daftar nasabah.
  - `getAccount(int index)`: mengambil rekening berdasarkan indeks; mengembalikan `null` jika indeks tidak valid.
  - `getNumOfAccounts()`: mengembalikan jumlah rekening nasabah.

### 4. `Main.java`

Kelas ini merupakan titik masuk program dan mengatur interaksi melalui terminal.

- Membuat objek `Bank` dan mendaftarkan dua nasabah: **Maulidar Ihlas** dan **Ihlas Maulidar**.
- Membuat satu rekening untuk setiap nasabah, dengan saldo awal masing-masing `500000` dan `1000000`.
- Menggunakan `Scanner` untuk membaca pilihan menu.
- Menyediakan menu utama untuk memilih nasabah atau keluar, serta sub-menu ATM untuk cek saldo, setor tunai, tarik tunai, transfer, dan kembali.
- Transfer dilakukan otomatis ke rekening nasabah lainnya.

---

## 💻 Tampilan Output Program

Berikut tangkapan layar output program:

![Tampilan output program ATM](program_output/Screenshot%202026-10-07%20130909.png)

---

## 🔄 Alur Program

1. **Pemilihan nasabah:** program menampilkan daftar nasabah yang tersimpan di dalam `ArrayList`. Pilih nomor nasabah untuk membuka menu ATM atau `0` untuk keluar.
2. **Menu ATM:** program menampilkan menu transaksi untuk nasabah yang dipilih.
3. **Cek saldo:** pilihan `1` menampilkan saldo rekening nasabah.
4. **Setor tunai:** pilihan `2` meminta nominal setoran. Setoran berhasil jika nominal lebih dari nol.
5. **Tarik tunai:** pilihan `3` meminta nominal penarikan. Penarikan berhasil jika nominal lebih dari nol dan saldo mencukupi.
6. **Transfer:** pilihan `4` meminta nominal transfer dan mengirimkannya ke rekening nasabah lainnya. Transfer hanya berhasil jika nominal valid dan saldo mencukupi.
7. **Kembali atau keluar:** pilihan `5` kembali ke menu pemilihan nasabah. Pilihan `0` pada menu utama mengakhiri program.

## 🚀 Cara Menjalankan Program

Pastikan Java 11 atau versi lebih baru tersedia, lalu buka terminal pada direktori repositori.

### Menjalankan langsung dari berkas sumber

```bash
cd src
java Main.java
```

### Mengompilasi lalu menjalankan

```bash
cd src
javac *.java
java Main
```
