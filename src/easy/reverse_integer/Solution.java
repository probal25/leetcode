package easy.reverse_integer;


public class Solution {

    public static void main(String[] args) {
        int positive = 1534236469;
        int negative = -1234;
        System.out.println(reverse(negative));
    }

    public static int reverse(int num) {
        int carry;
        int result = 0;
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = num * -1;
        }
        while (num > 0) {
            carry = num % 10;
            result = 10 * result + carry;
            num = (num - carry) / 10;

            if (result % 10 != carry) return 0;
        }
        return (isNegative ? (result * -1) : result);
    }
}
