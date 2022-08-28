package easy.maximum_nesting_depth_of_the_parentheses;

public class Solution {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int open = 0, depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            if (c == ')') open--;
            depth = Math.max(depth, open);
        }
        return depth;
    }
}
