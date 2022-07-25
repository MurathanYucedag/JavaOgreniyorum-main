import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0-999: ");

        int input = scanner.nextInt();

        int firstDigit  = input / 100;
        int secondDigit = (input / 10) % 10;
        int thirdDigit  = input % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of digits is: " + sum);
    }
}
