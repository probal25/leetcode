package easy.valid_anagram;
/*
    Input: s = "anagram", t = "nagaram"
    Output: true
*/

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        boolean b = true;
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]){
                b = false;
                break;
            }
        }
        return b;
    }
}
