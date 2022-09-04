package easy.number_of_good_pair;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums));
    }

    // todo - EQUATION
    // Count how many times each number appears. If a number appears n times,
    // then [ n * (n – 1) / 2 ] good pairs can be made with this number.

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (Integer integer : nums) {
            if (!countMap.containsKey(integer)) {
                countMap.put(integer, 1);
            }
            else {
                countMap.put(integer, (countMap.get(integer) + 1));
            }
        }
        int countOfIdenticalPairs = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer v = entry.getValue();
            countOfIdenticalPairs += (v * (v - 1)) / 2;
        }
        return countOfIdenticalPairs;
    }

}
