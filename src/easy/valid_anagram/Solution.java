package easy.valid_anagram;


import java.util.HashMap;

/*
    Input: s = "anagram", t = "nagaram"
    Output: true
*/
public class Solution {

    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        addValuesCountMap(s, sCount);
        addValuesCountMap(t, tCount);
        return sCount.equals(tCount);
    }

    private static void addValuesCountMap(String s, HashMap<Character, Integer> countMap) {
        for (Integer i = 0; i < s.length(); i++) {
            if (!countMap.containsKey(s.charAt(i))) countMap.put(s.charAt(i), 1);
            else {
                countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);
            }
        }
    }
}
