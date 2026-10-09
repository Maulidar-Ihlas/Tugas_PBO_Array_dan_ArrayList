import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        // Menambahkan customer
        bank.addCustomer("Maulidar", "Ihlas");
        bank.addCustomer("Ihlas", "Maulidar");

        // Membuat account
        bank.getCustomer(0).setAccount(new Account(500000));
        bank.getCustomer(1).setAccount(new Account(1000000));

        System.out.println("===== PROGRAM ATM =====");

        int pilihanCustomer;

        do {
            System.out.println("\nPilih Customer:");

            for (int i = 0; i < bank.getNumOfCustomers(); i++) {
                Customer customer = bank.getCustomer(i);

                System.out.println(
                        (i + 1) + ". "
                                + customer.getFullName()
                );
            }

            System.out.println("0. Keluar");

            System.out.print("Pilihan: ");
            pilihanCustomer = scanner.nextInt();

            if (pilihanCustomer == 0) {
                break;
            }

            if (pilihanCustomer < 1 ||
                    pilihanCustomer > bank.getNumOfCustomers()) {

                System.out.println("Pilihan tidak valid.");
                continue;
            }

            Customer customer =
                    bank.getCustomer(pilihanCustomer - 1);

            Account account =
                    customer.getAccount(0);

            int menu;

            do {

                System.out.println(
                        "\n===== ATM "
                                + customer.getFullName()
                                + " ====="
                );

                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Transfer");
                System.out.println("5. Kembali");

                System.out.print("Pilih menu: ");
                menu = scanner.nextInt();

                switch (menu) {

                    case 1:
                        System.out.println(
                                "Saldo: Rp"
                                        + account.getBalance()
                        );
                        break;

                    case 2:
                        System.out.print(
                                "Masukkan jumlah setor: "
                        );

                        double setor =
                                scanner.nextDouble();

                        if (account.deposit(setor)) {

                            System.out.println(
                                    "Setoran berhasil."
                            );

                        } else {

                            System.out.println(
                                    "Jumlah tidak valid."
                            );
                        }

                        break;

                    case 3:
                        System.out.print(
                                "Masukkan jumlah tarik: "
                        );

                        double tarik =
                                scanner.nextDouble();

                        if (account.withdraw(tarik)) {

                            System.out.println(
                                    "Penarikan berhasil."
                            );

                        } else {

                            System.out.println(
                                    "Saldo tidak mencukupi."
                            );
                        }

                        break;

                    case 4:

                        System.out.print(
                                "Masukkan jumlah transfer: "
                        );

                        double transfer =
                                scanner.nextDouble();

                        // Untuk contoh sederhana,
                        // transfer dari customer 1 ke customer 2
                        Account tujuan;

                        if (pilihanCustomer == 1) {
                            tujuan =
                                    bank.getCustomer(1).getAccount(0);
                        } else {
                            tujuan =
                                    bank.getCustomer(0).getAccount(0);
                        }

                        if (account.transfer(tujuan, transfer)) {

                            System.out.println(
                                    "Transfer berhasil."
                            );

                        } else {

                            System.out.println(
                                    "Transfer gagal."
                            );
                        }

                        break;

                    case 5:
                        System.out.println(
                                "Kembali ke pilihan customer."
                        );
                        break;

                    default:
                        System.out.println(
                                "Menu tidak tersedia."
                        );
                }

            } while (menu != 5);

        } while (true);

        System.out.println(
                "Terima kasih."
        );

        scanner.close();
    }
}