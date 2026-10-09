public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        // Menginisialisasi array customers dengan ukuran maksimum (lebih besar dari 5)
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        // Membuat objek Customer baru dan menambahkannya ke array
        customers[numberOfCustomers] = new Customer(f, l);
        // Meningkatkan indeks numberOfCustomers
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}