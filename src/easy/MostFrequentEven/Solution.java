package problem.MostFrequentEven;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums));
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (Integer i : nums) {
            if (i % 2 == 0) {
                if (!countMap.containsKey(i)) {
                    countMap.put(i, 1);
                } else {
                    countMap.put(i, (countMap.get(i) + 1));
                }
            }
        }
        if (countMap.isEmpty()) return -1;
        Map<Integer, Integer> sortedByValue = countMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortedByValue.entrySet().iterator().next().getKey();
    }
}
