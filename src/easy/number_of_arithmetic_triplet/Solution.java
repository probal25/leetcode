package easy.number_of_arithmetic_triplet;

/*

    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
    A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
    i < j < k,
    nums[j] - nums[i] == diff, and
    nums[k] - nums[j] == diff.
    Return the number of unique arithmetic triplets.

    todo Testcase
    Input: nums = [0,1,4,6,7,10], diff = 3
    Output: 2
    Explanation:
    (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
    (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.

*/

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        System.out.println(arithmeticTriplets(nums, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int i = 0;
        int j = 1;
        int count = 0;
        int tripletCount = 0;
        while (i < j) {
            if (nums[j] - nums[i] == diff) {
                count++;
            }
            j++;
            if (j == (nums.length -1)) {
                i++;
                j = i + 1;
            }
        }
        return count/diff;
    }
}
