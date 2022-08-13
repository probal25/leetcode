package easy.two_sum_2;

import java.util.Arrays;

/*
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
*/
public class Solution {

    public static void main(String[] args) {
        int[] inputArray = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(getTargetIndexes(inputArray, target)));
        System.out.println(Arrays.toString(getTargetIndexesUsingTwoPointers(inputArray, target)));
    }

    // generic solution
    private static int[] getTargetIndexes(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if ((inputArray[i] + inputArray[j]) == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // two pointer solution

    private static int[] getTargetIndexesUsingTwoPointers(int[] numbers, int target) {
        int lowIndex = 0, length = numbers.length, highIndex = length - 1;
        while (lowIndex < highIndex) {
            int sum = numbers[lowIndex] + numbers[highIndex];
            if (sum == target) return new int[]{lowIndex + 1, highIndex + 1};
            else if (sum > target) {
                highIndex--;
            } else {
                lowIndex++;
            }
        }

        return new int[]{-1, -1};
    }
}
