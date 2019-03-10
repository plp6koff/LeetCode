import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;

public class LongestCommonPrefix {

    public static void main(String[] args) {


        String[] input = new String[]{"flower","flow","flight"};
        String result = longestCommonPrefix(input);
        if (result == null) {
            System.out.println("There is no common prefix among the input strings.");
        } else {
            System.out.println("Result is [" + result + "]");
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, Integer> prefMap = new HashMap<String, Integer>();

        for (int i = 0; i <= strs.length - 1; i ++) {

            String firstStr = "";
            if (strs[i] == null || strs[i].length() == 0) {
                continue;
            } else {
                firstStr = strs[i];
            }
            for (int j = 0 ; j <= firstStr.length() - 1; j ++) {
                String tmpPref = firstStr.substring(0, j + 1);
                if (prefMap.containsKey(tmpPref)) {
                    int currIndex = prefMap.get(tmpPref);
                    prefMap.remove(tmpPref);
                    prefMap.put(tmpPref, currIndex + 1);
                } else {
                    prefMap.put(tmpPref, 1);
                }
            }
        }

        int curIndex = 0;
        for (Map.Entry<String, Integer> entry : prefMap.entrySet()) {

            if (entry.getKey().length() > curIndex && entry.getValue() == strs.length) {
                curIndex = entry.getKey().length();
                result = entry.getKey();
            }
        }


        return result;
    }
}
