package easy.valid_anagram;
/*
    Input: s = "anagram", t = "nagaram"
    Output: true
*/

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        String s = "car", t = "rat";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        s = String.valueOf(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        t = String.valueOf(tChars);

        return s.equals(t);
    }
}
