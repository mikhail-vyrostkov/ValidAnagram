import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "cacc";
        String t = "ccac";
        System.out.println(Solution.isAnagram(s, t));
    }

    public static class Solution {
        public static boolean isAnagram(String s, String t) {
//            my first solution.
//            Runtime = 228 ms; Memory = 42.4 MB
//            if (s.length() == t.length()) {
//                char[] sChars = s.toCharArray();
//                char[] tChars = t.toCharArray();
//                List<Character> sList = new ArrayList<>();
//                for (char c : sChars) {
//                    sList.add(c);
//                }
//                for (int i = 0; i < t.length(); i++) {
//                    if (sList.contains(tChars[i])) {
//                        sList.remove(sList.lastIndexOf(tChars[i]));
//                    }
//                }
//                return sList.size() == 0;
//            }
//            return false;

            if (s.length() != t.length()) {
                return false;
            }

            // This solution is perfect, but I didn't think of it at the very beginning.
            // Runtime = 3 ms; Memory = 42.4 MB
            char[] cArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            Arrays.sort(cArr);
            Arrays.sort(tArr);

            String sStr = String.valueOf(cArr);
            String tStr = String.valueOf(tArr);

            return sStr.equals(tStr);
        }
    }
}