package hackerrank;

class ResultRepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long aCount = 0;
        long totalACount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }
        totalACount = aCount * (n / s.length());
        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a') {
                totalACount++;
            }
        }
        return totalACount;
    }
}

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(ResultRepeatedString.repeatedString("aba", 10));
    }
}
