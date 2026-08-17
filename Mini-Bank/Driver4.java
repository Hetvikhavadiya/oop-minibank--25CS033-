public class Driver4 {

    public static void main(String[] args) {

        Account a1 = new Account(101, "Parthavi", 5000);
        Account a2 = new Account(101, "Hetvi", 8000);
        Account a3 = new Account(102, "Nyushi", 7000);

        // Print using toString()
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println();

        // Compare accounts
        System.out.println("a1 equals a2 : " + a1.equals(a2));
        System.out.println("a1 equals a3 : " + a1.equals(a3));

        System.out.println();

        // Create Customer
        Customer.Address address =
                new Customer.Address(
                        "Ravapar Road",
                        "Morbi",
                        "363641");

        Customer c1 = new Customer("Parthavi", address);

        // Clone customer
        Customer c2 = c1.clone();

        System.out.println("Customer Name : " + c2.getName());
        System.out.println("City : " + c2.getAddress().getCity());

        System.out.println();

        // instanceof
        Object obj = a1;

        if (obj instanceof Account) {
            System.out.println("obj is an Account object.");
        } else {
            System.out.println("obj is NOT an Account object.");
        }
    }
}

