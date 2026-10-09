import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers.add(customer);
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }

        return null;
    }

    public int getNumOfCustomers() {
        return customers.size();
    }
}