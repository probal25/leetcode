package easy.happy_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
// todo - not done yet

    public static boolean isHappy(int n) {
        int sum = 0;
        List<Integer> visited = new ArrayList<>();
        while (true) {
            List<Integer> digits = getDigits(n);
            for (Integer i : digits) {
                sum += (i * i);
            }
            System.out.println(sum);
            if (sum == 1) return true;
            n = sum;
            if (visited.contains(n)) return false;
            visited.add(n);
            sum = 0;
        }
    }

    private static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            digits.add(digit);
            temp = (temp - digit) / 10;
        }

        Collections.reverse(digits);
        return digits;
    }
}
