package easy.digit_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String s = "00000000";
//        String s = "11111222223";
        System.out.println(digitSum(s, 3));
    }

    public static String digitSum(String s, int k) {
        if (s.length() <= k) return s;
        StringBuilder resultBuilder = new StringBuilder();
        List<String> dividedResults = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (resultBuilder.length() == k){
                dividedResults.add(resultBuilder.toString());
                resultBuilder = new StringBuilder();
            }
            resultBuilder.append(s.charAt(i));
        }
        dividedResults.add(resultBuilder.toString());
        StringBuilder newValue = new StringBuilder();
        for (String value : dividedResults) {
            int sum = 0;
            for (int i = 0; i < value.length(); i++) {
                sum += Integer.parseInt(String.valueOf(value.charAt(i)));
            }
            newValue.append(sum);
        }
        return digitSum(newValue.toString(), k);
    }
}
