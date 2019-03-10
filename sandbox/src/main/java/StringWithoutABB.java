import java.util.HashSet;
import java.util.Set;

public class StringWithoutABB {


    private static final char a = 'a';
    private static final char b = 'b';

    public static void main(String[] args) {

        System.out.println(strWithout3a3b(4, 1));
    }

    public static String strWithout3a3b(int A, int B) {

        if (A < 0 || A > 100 || B < 0 || B > 100) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        if (A > 0 && A > B) {
            sb = strController(a, b, sb, A, B);
        } else if (B > 0) {
            sb = strController(b, a, sb, B, A);
        }
        return sb.toString();
    }

    public static StringBuffer strController(char prim, char sec, StringBuffer fullStr,
                                             int primCount, int secCount) {

        if (primCount == 0 && secCount == 0) {
            return fullStr;
        }

        if (primCount < secCount) {
            char tmp = prim;
            prim = sec;
            sec = tmp;
            int tmpCount = primCount;
            primCount = secCount;
            secCount = tmpCount;
        }

        if (startsWith(fullStr, prim) && endsWith(fullStr, prim) && secCount > 0) {
            fullStr = new StringBuffer(sec + fullStr.toString());
            secCount--;
        } else if (endsWith(fullStr, prim)) {
            if (fullStr.length() > 2) {
                fullStr = new StringBuffer(prim + fullStr.toString());
                primCount--;
            } else {
                fullStr = new StringBuffer(sec + fullStr.toString());
                secCount--;
            }
        } else if (startsWith(fullStr, prim)) {
            if (fullStr.length() > 2) {
                fullStr = fullStr.append(prim);
                primCount--;
            } else {
                fullStr = fullStr.append(sec);
                secCount--;
            }
        } else {
            fullStr = fullStr.append(prim);
            primCount--;
        }
        return strController(prim, sec, fullStr, primCount, secCount);
    }

    private static boolean startsWith(StringBuffer sb, char what) {
        return sb.length() >=2 && sb.charAt(0) == what && sb.charAt(1) == what;
    }

    private static boolean endsWith(StringBuffer sb, char what) {
        return sb.length() >= 2  && sb.charAt(sb.length() - 1) == what && sb.charAt(sb.length() - 2) == what;
    }
}
