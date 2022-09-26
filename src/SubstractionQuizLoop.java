import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner scanner = new Scanner(System.in);

        int number1;
        while (count < NUMBER_OF_QUESTIONS) {

            // 1. Generate two random single-digit integerts
            number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer " What is number1 - number2?"
            System.out.println("What is " + number1 + " - " + number2 + "?");
            int answer = scanner.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            }

            else
                System.out.println("Your answer is wrong.\n" + number1
                + " - " + number2 + " should be " + (number1 - number2));

            count++; //Increase the question

            output += "/n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? "correct": "wrong");

        }

//       long endTime = System.currentTimeMillis();
//       long testTime = endTime – startTime;
//
//       System.out.println("Correct count is " + correctCount +
//                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}