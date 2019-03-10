import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String input = "([}}";
        if (isValid(input)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    public static boolean isValid(String s) {

        int l = s.length();
        if (l == 0) {
            return true;
        } else if (l % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>(3);
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');


        Stack<Character> stackBrackets = new Stack<Character>();

        for (int i = 0; i < s.length() - 1 ; i ++) {

            char tmp = s.charAt(i);

            if (map.containsKey(tmp)) {

                char top = stackBrackets.empty() ? 'x' : stackBrackets.pop();
                if (top != map.get(tmp)) {
                    return false;
                }
            } else {
                stackBrackets.push(tmp);
            }
        }

        return stackBrackets.isEmpty();
    }
}
