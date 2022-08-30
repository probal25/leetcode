package easy.shuffle_the_array;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] results = new int[nums.length];
        int i = 0, k = 0;
        while (k < nums.length) {
            if (k % 2 != 0) {
                results[k] = nums[n];
                n++;
            } else {
                results[k] = nums[i];
                i++;
            }
            k++;
        }
        return results;
    }
}
