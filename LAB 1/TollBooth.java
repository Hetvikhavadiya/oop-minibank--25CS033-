import java.util.Scanner;

record Vehicle(String number, String type) {}

public class TollBooth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike = 0, car = 0, truck = 0;

        while (true) {
            System.out.print("Enter Vehicle Number (or done): ");
            String number = sc.nextLine();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.nextLine();

            Vehicle v = new Vehicle(number, type);

            int toll = switch (v.type().toLowerCase()) {
                case "bike" -> 20;
                case "car" -> 50;
                case "truck" -> 150;
                default -> 0;
            };

            total = total + toll;

            if (v.type().equalsIgnoreCase("bike"))
                bike++;
            else if (v.type().equalsIgnoreCase("car"))
                car++;
            else if (v.type().equalsIgnoreCase("truck"))
                truck++;
        }

        System.out.println("Total Toll: " + total);

        if (bike >= car && bike >= truck)
            System.out.println("Most Frequent: bike");
        else if (car >= bike && car >= truck)
            System.out.println("Most Frequent: car");
        else
            System.out.println("Most Frequent: truck");

        sc.close();
    }
}
