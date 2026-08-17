import java.util.regex.Pattern;

class Validator {

    private static final Pattern MOBILE =
            Pattern.compile("^[6-9][0-9]{9}$");

    private static final Pattern EMAIL =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private static final Pattern PAN =
            Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]$");

    private static final Pattern IFSC =
            Pattern.compile("^[A-Z]{4}0[A-Z0-9]{6}$");

    public static boolean isValidMobile(String mobile) {
        return MOBILE.matcher(mobile).matches();
    }

    public static boolean isValidEmail(String email) {
        return EMAIL.matcher(email).matches();
    }

    public static boolean isValidPan(String pan) {
        return PAN.matcher(pan).matches();
    }

    public static boolean isValidIfsc(String ifsc) {
        return IFSC.matcher(ifsc).matches();
    }
}

enum TransactionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER
}

record Command(TransactionType type, String accountNumber, long amount) {
}

class CommandParser {

    public static Command parse(String line) {
        String[] parts = line.trim().split("\\s+");

        TransactionType type =
                TransactionType.valueOf(parts[0].toUpperCase());

        String accountNumber = parts[1];

        long amount = Long.parseLong(parts[2]);

        return new Command(type, accountNumber, amount);
    }
}

class Account {

    private String accountNumber;
    private String name;
    private long balance;

    public Account(String accountNumber, String name, long balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
}

class StatementFormatter {

    public static String buildStatement(Account account) {

        StringBuilder statement = new StringBuilder();

        statement.append("====================================\n");
        statement.append("          MINI BANK STATEMENT       \n");
        statement.append("====================================\n");
        statement.append("Account Number : ")
                .append(account.getAccountNumber())
                .append("\n");
        statement.append("Account Holder : ")
                .append(account.getName())
                .append("\n");
        statement.append("Current Balance: rs.")
                .append(account.getBalance())
                .append("\n");
        statement.append("====================================");

        return statement.toString();
    }
}

