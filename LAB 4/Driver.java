import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        String[] passwords = {
            "abc",
            "abcdefgh",
            "Abcdefgh",
            "Abcd1234",
            "Abcd1234!",
            "password1"
        };

        for (String pw : passwords) {

            System.out.println("Password: " + pw);

            System.out.println("Length >= 8: " + PasswordChecker.Length(pw));

            System.out.println("Uppercase letter: " + PasswordChecker.Uppercase(pw));

            System.out.println("Digit: " + PasswordChecker.Digit(pw));

            System.out.println("Special character: " + PasswordChecker.Special(pw));

            System.out.println("Strength: " + PasswordChecker.strength(pw));

            System.out.println("-------------------------");
        }
    }
}


