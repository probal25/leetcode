package easy.final_value_of_variable_after_performing_operations;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String[] values = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(values));
        System.out.println(finalValueAfterOperations_2(values));
    }

    public static int finalValueAfterOperations(String[] operations) {
        Map<String, Integer> operationMap = new HashMap<>();
        operationMap.put("X++", 1);
        operationMap.put("X--", -1);
        operationMap.put("++X", 1);
        operationMap.put("--X", -1);
        int sum = 0;
        for (String operation : operations) {
            sum += operationMap.get(operation);
        }
        return sum;
    }

    public static int finalValueAfterOperations_2(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            if (operation.contains("+")) sum +=1;
            else sum -= 1;
        }
        return sum;
    }

}
