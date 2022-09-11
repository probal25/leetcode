package easy.remove_number_from_digits_to_max;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
//        String num = "133235";
        String num = "541596";
//        String num = "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
        System.out.println(removeDigit(num, '5'));
    }

    public static String removeDigit(String number, char digit) {
        int index = 0;
        for (int i = 0; i < number.length(); ++i) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i < number.length() - 1 && digit < number.charAt(i + 1))
                    break;
            }
        }
        return number.substring(0, index) + number.substring(index + 1);
    }
}
