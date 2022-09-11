package easy.create_target_array_in_given_order;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int length = nums.length;
        int[] target = new int[length];
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            linkedList.add(index[i], nums[i]);
        }
        int i = 0;
        for (Integer value : linkedList) {
            target[i] = value;
            i++;
        }
        return target;
    }
}
