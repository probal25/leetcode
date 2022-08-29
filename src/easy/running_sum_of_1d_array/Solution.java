package easy.running_sum_of_1d_array;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
        System.out.println(Arrays.toString(runningSumOptimization(nums)));
        System.out.println(Arrays.toString(runningSumOptimization_2(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            results[i] = sum;
        }
        return results;
    }

    public static int[] runningSumOptimization(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            results[i] = results[i - 1] + nums[i];
        }
        return results;
    }

    // elemenating extra space
    public static int[] runningSumOptimization_2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }



}
