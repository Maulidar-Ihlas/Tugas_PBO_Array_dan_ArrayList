# Tugas PBO - Simulasi Bank Sederhana (Java)

Repositori ini berisi program Java sederhana yang menggambarkan konsep **Pemrograman Berorientasi Objek (PBO)** dengan objek `Bank`, `Customer`, dan `Account`. Program ini mensimulasikan sistem bank kecil untuk menambah nasabah, membuat rekening, serta melakukan transaksi seperti setor dan tarik tunai.

## 📁 Struktur Repositori

```text
Tugas_PBO_Array_dan_ArrayList/
├── program_output/
│   └── Screenshot 2026-10-07 130909.png
├── src/
│   ├── Account.java   # Mengelola saldo dan transaksi rekening
│   ├── Bank.java      # Menyimpan daftar nasabah
│   ├── Customer.java  # Menyimpan data nasabah dan rekeningnya
│   └── Main.java      # Program utama yang menjalankan simulasi
├── README.md
└── .gitignore
```

## 🧩 Penjelasan Kelas

### 1. `Account.java`

Kelas ini merepresentasikan rekening bank.

- Atribut:
  - `balance` (`double`): saldo rekening
- Method:
  - `getBalance()`: mengembalikan saldo saat ini
  - `deposit(double amount)`: menambahkan saldo jika jumlahnya lebih dari 0
  - `withdraw(double amount)`: mengurangi saldo jika saldo mencukupi

### 2. `Bank.java`

Kelas ini mengelola daftar nasabah menggunakan array.

- Atribut:
  - `customers`: array untuk menyimpan objek `Customer`
  - `numberOfCustomers`: jumlah nasabah yang terdaftar
- Method:
  - `addCustomer(String f, String l)`: menambahkan nasabah baru
  - `getCustomer(int index)`: mengambil nasabah berdasarkan indeks
  - `getNumOfCustomers()`: mengembalikan jumlah nasabah

### 3. `Customer.java`

Kelas ini merepresentasikan data nasabah beserta rekeningnya.

- Atribut:
  - `firstName`, `lastName`: nama nasabah
  - `accounts`: array untuk menyimpan rekening nasabah
  - `numberOfAccounts`: jumlah rekening milik nasabah
- Method:
  - `getFirstName()`, `getLastName()`: mengambil nama nasabah
  - `setAccount(Account acct)`: menambahkan rekening ke nasabah
  - `getAccount(int account_index)`: mengambil rekening berdasarkan indeks
  - `getNumOfAccounts()`: mengembalikan jumlah rekening

### 4. `Main.java`

Kelas utama ini berfungsi sebagai titik masuk program. Dalam `main()`, program:

- membuat objek `Bank`
- menambahkan beberapa nasabah
- membuat rekening baru untuk nasabah pertama
- melakukan simulasi `deposit` dan `withdraw`
- menampilkan saldo sebelum dan sesudah transaksi

## ⚙️ Fitur Program

- Menambah nasabah baru ke dalam bank
- Menyimpan beberapa rekening untuk satu nasabah
- Menghitung jumlah nasabah dan rekening
- Menyetor uang ke rekening
- Menarik uang dari rekening dengan validasi saldo
- Menampilkan hasil transaksi di terminal

## 🔄 Alur Kerja Program

1. Membuat objek `Bank`.
2. Menambahkan nasabah seperti `Budi Santoso`, `Susi Susanti`, dan `Andi Wijaya`.
3. Mengambil nasabah pertama dan memberi rekening dengan saldo awal.
4. Melakukan transaksi deposit dan withdrawal.
5. Menampilkan saldo akhir nasabah.

## 🖥️ Tampilan Output

Program akan menampilkan output seperti berikut:

![Hasil output program](program_output/Screenshot%202026-10-09%20135446.png)

## 🚀 Cara Menjalankan Program

Pastikan Java sudah terinstall di komputer Anda, lalu jalankan perintah berikut dari direktori repositori.

### 1) Compile dan jalankan dari folder `src`

```bash
cd src
javac *.java
java Main
```

### 2) Jika Anda berada di direktori repositori utama

```bash
cd src
javac *.java
java Main
```

## 📝 Catatan

Proyek ini cocok digunakan sebagai contoh pembelajaran tentang:

- kelas dan objek
- enkapsulasi
- hubungan antar kelas
- penggunaan array dalam Java
- simulasi transaksi sederhana dalam program bank

