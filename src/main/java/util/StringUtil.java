package util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    public static String repeat(String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    public static String padLeft (String s, int n) {

        return repeat(" ", n - s.length()) + s;
    }

    public static String padRight (String s, int n) {

        return s + repeat(" ", n - s.length());
    }

    public static List<Integer> listOfNumbers (int start, int end) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
}