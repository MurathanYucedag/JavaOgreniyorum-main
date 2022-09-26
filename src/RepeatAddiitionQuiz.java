import java.util.Scanner;

public class RepeatAddiitionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What i " + number1 + " + " + number2 + "? ");
        int answer = scanner.nextInt();

        while(number1 + number2 != answer){
            System.out.println("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "?");
            answer = scanner.nextInt();

        }
        System.out.println("You got it !");
    }
}
