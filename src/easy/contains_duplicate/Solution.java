package easy.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int n : nums) {
            integerSet.add(n);
        }
        return !(integerSet.size() == nums.length);
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int n : nums) {
            if (integerSet.contains(n)) return true;
            integerSet.add(n);
        }
        return false;
    }
}