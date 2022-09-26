import java.util.Scanner;

public class ReverseOfString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        //char[] arr = text.toCharArray();

        int l = text.length();

        for(int i= l-1; i>=0; i--){

            System.out.println(text.charAt(i));
        }

    }
}

