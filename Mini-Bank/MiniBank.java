
public class MiniBank {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          MINIBANK VALIDATION");
        System.out.println("========================================");

        System.out.println("\n1. MOBILE NUMBER VALIDATION");

        String validMobile = "9876543210";
        String invalidMobile = "12345";

        System.out.println("Input  : " + validMobile);
        System.out.println("Result : " +
                (Validator.isValidMobile(validMobile) ? "VALID" : "INVALID"));

        System.out.println("Input  : " + invalidMobile);
        System.out.println("Result : " +
                (Validator.isValidMobile(invalidMobile) ? "VALID" : "INVALID"));

        System.out.println("\n2. EMAIL VALIDATION");

        String validEmail = "abc@gmail.com";
        String invalidEmail = "abc@gmail";

        System.out.println("Input  : " + validEmail);
        System.out.println("Result : " +
                (Validator.isValidEmail(validEmail) ? "VALID" : "INVALID"));

        System.out.println("Input  : " + invalidEmail);
        System.out.println("Result : " +
                (Validator.isValidEmail(invalidEmail) ? "VALID" : "INVALID"));

        System.out.println("\n3. PAN VALIDATION");

        String validPan = "ABCDE1234F";
        String invalidPan = "ABC123";

        System.out.println("Input  : " + validPan);
        System.out.println("Result : " +
                (Validator.isValidPan(validPan) ? "VALID" : "INVALID"));

        System.out.println("Input  : " + invalidPan);
        System.out.println("Result : " +
                (Validator.isValidPan(invalidPan) ? "VALID" : "INVALID"));

        System.out.println("\n4. IFSC CODE VALIDATION");

        String validIfsc = "SBIN0001234";
        String invalidIfsc = "SBI123";

        System.out.println("Input  : " + validIfsc);
        System.out.println("Result : " +
                (Validator.isValidIfsc(validIfsc) ? "VALID" : "INVALID"));

        System.out.println("Input  : " + invalidIfsc);
        System.out.println("Result : " +
                (Validator.isValidIfsc(invalidIfsc) ? "VALID" : "INVALID"));

        System.out.println("\n5. COMMAND PARSING");

        String input = "DEPOSIT AC0001 500";

        System.out.println("Command Input : " + input);

        Command command = CommandParser.parse(input);

        System.out.println("Transaction Type : " + command.type());
        System.out.println("Account Number   : " + command.accountNumber());
        System.out.println("Amount           : " + command.amount());

        System.out.println("\n6. ACCOUNT STATEMENT");

        Account account =
                new Account("AC0001", "Parthavi", 5000);

        System.out.println(
                StatementFormatter.buildStatement(account)
        );

    }
}


