package easy.binary_search;

public class Solution {

    public static void main(String[] args) {
        int[] ints = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(ints, 9));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        int middle = (low + high) / 2;

        while (low <= high) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            middle = (high + low) / 2;
        }

        return -1;
    }
}
