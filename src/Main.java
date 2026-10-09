public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Bank baru
        Bank bankKita = new Bank();

        // 2. Menambahkan beberapa nasabah (Customer) ke dalam Bank
        bankKita.addCustomer("Budi", "Santoso");
        bankKita.addCustomer("Susi", "Susanti");
        bankKita.addCustomer("Andi", "Wijaya");

        // Menampilkan jumlah nasabah yang ada di bank
        System.out.println("Jumlah nasabah di bank: " + bankKita.getNumOfCustomers());
        System.out.println("----------------------------------------");

        // 3. Mengambil data nasabah pertama (indeks ke-0)
        Customer nasabah1 = bankKita.getCustomer(0);
        System.out.println("Melayani Nasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());

        // 4. Membuat akun (Account) baru dengan saldo awal 500.000 untuk Budi
        Account akunBudi = new Account(500000);
        
        // Memasukkan akun tersebut ke dalam daftar akun milik Budi
        nasabah1.setAccount(akunBudi);

        // Menampilkan saldo awal Budi (mengambil akun pertama di indeks 0)
        System.out.println("Saldo Awal: Rp " + nasabah1.getAccount(0).getBalance());

        // 5. Melakukan simulasi transaksi Deposit (Setor)
        System.out.println("Melakukan deposit sebesar Rp 150.000...");
        nasabah1.getAccount(0).deposit(150000);
        System.out.println("Saldo saat ini: Rp " + nasabah1.getAccount(0).getBalance());

        // 6. Melakukan simulasi transaksi Withdraw (Tarik Tunai) yang berhasil
        System.out.println("Melakukan penarikan sebesar Rp 200.000...");
        boolean statusTarik1 = nasabah1.getAccount(0).withdraw(200000);
        System.out.println("Status Penarikan (Sukses/Gagal): " + statusTarik1);
        System.out.println("Saldo saat ini: Rp " + nasabah1.getAccount(0).getBalance());

        // 7. Melakukan simulasi transaksi Withdraw (Tarik Tunai) yang gagal (saldo tidak cukup)
        System.out.println("Melakukan penarikan sebesar Rp 1.000.000...");
        boolean statusTarik2 = nasabah1.getAccount(0).withdraw(1000000);
        System.out.println("Status Penarikan (Sukses/Gagal): " + statusTarik2);
        
        System.out.println("----------------------------------------");
        // Menampilkan saldo akhir
        System.out.println("Saldo Akhir " + nasabah1.getFirstName() + " " + nasabah1.getLastName() + ": Rp " + nasabah1.getAccount(0).getBalance());
    }
}