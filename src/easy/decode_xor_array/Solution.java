package easy.decode_xor_array;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] encoded = {1, 2, 3};
        int first = 1;

        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            result[i+1] = encoded[i] ^ result[i];
        }
        return result;
    }
}
