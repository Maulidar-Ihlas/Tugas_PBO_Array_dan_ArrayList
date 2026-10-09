import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;

    private ArrayList<Account> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }

        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}