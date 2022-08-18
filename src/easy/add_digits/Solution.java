package easy.add_digits;

public class Solution {

    public static void main(String[] args) {
        System.out.println(addDigits(99));
    }

    public static int addDigits(int num) {
        int sum = 0;
        int temp;
        temp = num % 10;
        sum += temp;
        temp = num / 10;
        sum += temp;
        if(sum < 10) return sum;
        num = sum;
        return addDigits(num);
    }
}
