import java.util.Scanner;

public class SimpleMathQuestionGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many problem you want to solve: ");
        int problemCount = scanner.nextInt(); // Kaç soru çözmek istediğimizi istiyoruz.

        // Kaç soru çözeceğini kullanıcıdan istiyoruz ve buna göre rastgele işlemler sunacağız.
        int trueCounter = 0;
        int falseCounter = 0;

        for (int i = 1; i <= problemCount; i++) {

            int number1 = (int) (Math.random() * 21);
            int number2 = (int) (Math.random() * 21);

            int operation = (int) (Math.random() * 4 + 1); // opearation diye bir değişken tanımlıyoruz. Burada yapacağımız 4 işlemi tanıtacağız


            switch (operation) {

                case 1:

                    System.out.println("Sum = " + number1 + "+" + number2 + "?");
                    int result = scanner.nextInt();
                    if (number1 + number2 == result)
                        trueCounter++;
                    else if (number1 + number2 != result)
                        falseCounter++;
                    break;

                case 2:
                    System.out.println("Subs = " + number1 + "-" + number2 + "?");
                    result = scanner.nextInt();
                    if (number1 - number2 == result)
                        trueCounter++;
                    else if (number1 + number2 != result)
                        falseCounter++;
                    break;

                case 3:
                    System.out.println("Multiply = " + number1 + "*" + number2 + "?");
                    result = scanner.nextInt();
                    if (number1 * number2 == result)
                        trueCounter++;
                    else if (number1 + number2 != result)
                        falseCounter++;
                    break;

                case 4:
                    System.out.println("Div = " + number1 + "/" + number2 + "?");
                    result = scanner.nextInt();
                    if (number1 / number2 == result)
                        trueCounter++;
                    else if (number1 + number2 != result)
                        falseCounter++;
                    break;

            }

        }

        System.out.println("You have " + trueCounter + " true, " + falseCounter + " false answers.");
    }
}