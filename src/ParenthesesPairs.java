import java.util.HashMap;
import java.util.Map;

public class ParenthesesPairs {

    public static void main(String[] args) {
        String pair = "{([{}])}[](){[]}";
        System.out.println(isValid(pair));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
        for (int i = chars.length - 1; i >= 0; i--) {
            if (pairs.containsKey(chars[i])) {
                for (int j = i; j < chars.length; j++) {

                }
            }
        }
        return true;
    }
}
