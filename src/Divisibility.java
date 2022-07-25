import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();


        System.out.println("Is "+number+" divisible by 4 and 5? " + (number % 5 == 0 && number % 4 == 0));
        System.out.println("Is "+number+" divisible by 4 or 5? " + (number % 5 == 0 || number % 4 == 0));

        System.out.println("Is "+number+" divisible by 4 or 5 but not both? " + (number % 5 == 0 ^ number % 4 == 0));


    }
}
