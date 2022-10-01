package hackerrank;

import java.util.List;

class ResultJumpingOnTheClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int jumpCount = 0;
        for (int i = 0; c.size()-1 > i; i++) {
            if (i < c.size() - 2 && c.get(i+2) == 0) {
                i++;
            }
            jumpCount++;
        }
        return jumpCount;
    }

}

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(ResultJumpingOnTheClouds.jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
    }
}
