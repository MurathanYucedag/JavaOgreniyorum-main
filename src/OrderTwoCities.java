import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first country: ");
        String city1 = scanner.nextLine();

        System.out.println("Enter the second country: ");
        String city2 = scanner.nextLine();

        System.out.println("Enter the third country: ");
        String city3 = scanner.nextLine();

        String temp = "";

        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }

        if (city2.compareTo(city3) > 0) {
            temp = city3;
            city3 = city2;
            city2 = temp;
        }

        if (city1.compareTo(city3) > 0) {
            temp = city1;
            city1 = city3;
            city3 = temp;
        }

        System.out.println("The three cities in alphabetical order are "
                + city3 + " " + city2 + " " + city1);

    }
}
