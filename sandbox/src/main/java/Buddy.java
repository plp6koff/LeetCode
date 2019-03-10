import java.util.HashMap;
import java.util.Map;

public class Buddy {


    public static void main(String[] args) {

//        String A1 = "ab";
//        String B1 = "ba";
//        System.out.println("TC1: " + (buddyStrings(A1,B1) ? "Yes beeee" : " No beeeeee"));
//
//        String A2 = "aa";
//        String B2 = "aa";
//        System.out.println("TC2: " + (buddyStrings(A2,B2) ? "Yes beeee" : " No beeeeee"));
//
//        String A3 = "ab";
//        String B3 = "ab";
//        System.out.println("TC3: " + (buddyStrings(A3,B3) ? "Yes beeee" : " No beeeeee"));
//
//        String A4 = "";
//        String B4 = "aa";
//        System.out.println("TC4: " + (buddyStrings(A4,B4) ? "Yes beeee" : " No beeeeee"));

        String A5 = "abab";
        String B5 = "abab";
        System.out.println("TC5: " + (buddyStrings(A5,B5) ? "Yes beeee" : " No beeeeee"));

        String A6 = "abcd";
        String B6 = "abcd";
        System.out.println("TC6: " + (buddyStrings(A6,B6) ? "Yes beeee" : " No beeeeee"));

        String A7 = "aaaaaaabc";
        String B7 = "aaaaaaabc";
        System.out.println("TC7: " + (buddyStrings(A7,B7) ? "Yes beeee" : " No beeeeee"));
    }


    public static boolean buddyStrings(String A, String B) {

        if (A != null && B != null) {
            if (A.length() != B.length()
                    || A.length() < 0 || A.length() > 20000
                    || B.length() < 0 || B.length() > 20000) {
                return false;
            }  else {

                char a1 = '-';
                char a2 = '-';
                char b1 = '-';
                char b2 = '-';
                int index1 = -1;
                int index2 = -1;

                int foundCouple =0;
                Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
                for (int i = 0; i < A.length(); i++) {

                    char tmpA = A.charAt(i);
                    char tmpB = B.charAt(i);

                    if (tmpA !=  tmpB) {
                        if (index1 != -1 && index2 != -1) {
                            return false;
                        } else if (index1 == -1) {
                            a1 = tmpA;
                            b1 = tmpB;
                            index1 = i;
                        } else if (index2 == -1) {
                            a2 = tmpA;
                            b2 = tmpB;
                            index2 = i;
                        }
                    } else {
                        if (mapCount.containsKey(tmpA)) {
                            int k = mapCount.get(tmpA);
                            mapCount.remove(tmpA);
                            mapCount.put(tmpA,k++);
                            foundCouple++;
                            if (foundCouple >= 2) {
                                return true;
                            }
                        } else {
                            mapCount.put(tmpA,1);
                        }
                    }
                }

                if (index1 == -1 && index1 == -1) {

                    if (A.equals(B)) {
                        if (A.length() == 2) {
                            return  A.charAt(0) == A.charAt(1);
                        }
                    }
                } else if ((a1 == b1 || a1 == b2) && (a2 == b1 || a2 == b2)) {
                    return true;
                } else {
                    return false;
                }

            }
        }
        return false;
    }
}
