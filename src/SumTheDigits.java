import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0-999: ");

        int Sayi = scanner.nextInt();

        int Digit1 = Sayi / 100;
        int Digit2 = (Sayi/10) % 10;
        int Digit3 = Sayi % 10;

        int SumOfDigits = Digit1 + Digit2 + Digit3;

        System.out.println("The sum of digits is: " + SumOfDigits);
    }
}
