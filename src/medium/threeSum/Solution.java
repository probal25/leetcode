package medium.threeSum;

/*
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int numbers[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int num1Index = 0; num1Index + 2 < nums.length; num1Index++) {
            if (num1Index > 0 && nums[num1Index] == nums[num1Index - 1]) continue;
            int num2Index = num1Index + 1;
            int num3Index = nums.length - 1;

            while (num2Index < num3Index) {
                int sum = nums[num1Index] + nums[num2Index] + nums[num3Index];

                if (sum == 0) {
                    results.add(Arrays.asList(nums[num1Index] , nums[num2Index] , nums[num3Index]));
                    num3Index--;
                    while (num2Index < num3Index && nums[num3Index] == nums[num3Index + 1]) num3Index--;
                } else if (sum > 0) {
                    num3Index--;
                } else {
                    num2Index++;
                }
            }
        }
        return results;
    }
}
