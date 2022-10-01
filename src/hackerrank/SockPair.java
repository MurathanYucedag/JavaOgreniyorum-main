package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ResultSockPair {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> socks = new HashMap<>();
        int pairCount = 0;
        for (Integer i : ar) {
            if (socks.containsKey(i)) {
                socks.put(i, socks.get(i) + 1);
            } else {
                socks.put(i, 1);
            }
        }
        for (Integer val : socks.values()) {
            pairCount += val / 2;
        }
        return pairCount;
    }

}

public class SockPair {
    public static void main(String[] args) {
        System.out.println(ResultSockPair.sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}