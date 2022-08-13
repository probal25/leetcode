package easy.longest_common_prefix;

/*
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        longestCommonPrefix(strings);
//        System.out.println(longestCommonPrefix(strings));
    }

    public static void longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int len = strs.length;
        List<Character> characters = new ArrayList<>();
        for (String str : strs) {
            for (int j = 0; j < str.length(); j++) {
                if (characters.isEmpty()) {
                    characters.add(str.charAt(j));
                } else {
                    characters.add(str.charAt(j));
                }
            }
        }

        System.out.println(characters);
    }
}
