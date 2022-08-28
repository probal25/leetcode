package easy.valid_paranthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    } 

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('{', '}');
        charMap.put('[', ']');

        Stack<Character> resultStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                resultStack.push(s.charAt(i));
            } else {
                if (resultStack.isEmpty()) return false;
                Character popVal = resultStack.peek();
                if (charMap.get(popVal).equals(s.charAt(i))) {
                    resultStack.pop();
                } else {
                    return false;
                }
            }
        }
        return resultStack.empty();
    }
}
