class Customer {

    private String name;
    private String email;
    private String mobile;
    private final String customerId;

    private static long customerCounter = 101;

    private static String generateCustomerId() {
        return "CUST" + customerCounter++;
    }

    public Customer(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.customerId = generateCustomerId();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCustomerId() {
        return customerId;
    }
}

// Account Class
class Account {

    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static int accountCounter = 1;

    private static String generateAccountNumber() {
        return String.format("AC%04d", accountCounter++);
    }

    public Account(String ownerName, long openingBalance) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
    }

    public Account(String ownerName) {
        this(ownerName, 0);
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}

public class MiniBank2 {

    public static void main(String[] args) {

        Customer c1 = new Customer("Parthavi", "parthavi@gmail.com", "9876543210");
        Customer c2 = new Customer("Hetvi", "hetvi@gmail.com", "9876501234");
        Customer c3 = new Customer("Nyushi", "nyushi@gmail.com", "9988776655");

        Account[] accounts = new Account[3];

        accounts[0] = new Account(c1.getName(), 5000);
        accounts[1] = new Account(c2.getName(), 3000);
        accounts[2] = new Account(c3.getName());

        // Transactions
        accounts[0].deposit(2000);
        accounts[0].withdraw(1500);

        accounts[1].deposit(1000);
        accounts[1].withdraw(5000); // Fails

        accounts[2].deposit(7000);
        accounts[2].withdraw(2500);

        System.out.println("----- Account Details -----");

        for (Account acc : accounts) {
            System.out.println("Account Number : " + acc.getAccountNumber());
            System.out.println("Owner Name     : " + acc.getOwnerName());
            System.out.println("Balance        : Rs." + acc.getBalance());
            System.out.println("Active         : " + acc.isActive());
            System.out.println();
        }
    }
}

