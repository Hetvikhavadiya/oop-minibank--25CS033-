import java.util.Scanner;

record BankInfo(String name, String branch) { }

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

public class MiniBank1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "Charusat Branch");

        System.out.println("==================================");
        System.out.println(bank);
        System.out.println("==================================");

        boolean running = true;

        while (running) {

            System.out.println("\n------ MiniBank Menu ------");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            String message = switch (choice) {
                case 1 -> "Open Account - To be implemented in a later lab.";
                case 2 -> "Deposit - To be implemented in a later lab.";
                case 3 -> "Withdraw - To be implemented in a later lab.";
                case 4 -> "Transfer - To be implemented in a later lab.";
                case 5 -> {
                    running = false;
                    yield "Thank you for using MiniBank.";
                }
                default -> "Invalid choice! Please try again.";
            };

            System.out.println(message);
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}
