package easy.plus_one;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};
//        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
//        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int len = digits.length - 1;
            while (digits[len] == 9) {
                digits[len] = 0;
                len--;
                if (len < 0) break;
            }
            if (digits[0] == 0) {
                digits = Arrays.copyOf(digits, digits.length + 1);
                digits[0] = 1;
            } else {
                digits[len] = digits[len] + 1;
            }
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        return digits;
    }
}
