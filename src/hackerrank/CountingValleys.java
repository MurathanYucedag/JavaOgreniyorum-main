package hackerrank;

class ResultCountingValleys {
    public static int countingValleys(int steps, String path) {

        int seaLevel = 0;
        int countValley = 0;
        for (char p : path.toCharArray()) {
            if (seaLevel == 0 && p == 'D') {
                countValley++;
            }
            if (p == 'D') {
                seaLevel--;
            } else if (p == 'U') {
                seaLevel++;
            }
        }
        return countValley;
    }

}

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(ResultCountingValleys.countingValleys(8, "UDDDUDUU"));
    }
}
