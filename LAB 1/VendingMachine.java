import java.util.Scanner;

public class VendingMachine {

    enum Coin{
        ONE, TWO, FIVE, TEN
    }
    public static void main(String[] args) {
        int total = 0;
        int snackPrice = 15;

        Scanner sc = new Scanner(System.in);

        while (total < snackPrice) {

        System.out.print("Enter coin (ONE, TWO, FIVE, TEN): ");

        String input = sc.next().toUpperCase();

            int value = switch (input) {
                    case "ONE" -> 1;
                    case "TWO" -> 2;
                    case "FIVE" -> 5;
                    case "TEN" -> 10;
                    default -> 0;
                };

                total += value;
                System.out.println("Total : " + total);
        }

          System.out.println("Paid. Change: " + (total - snackPrice));

    }

}
