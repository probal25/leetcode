package problem.countItemsMatchingARule;

import java.util.HashMap;
import java.util.List;

//ruleKey=="type"and ruleValue==typei.
//ruleKey=="color"and ruleValue==colori.
//ruleKey=="name"and ruleValue==namei.

public class Solution {

    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> ruleMap = new HashMap<>();
        ruleMap.put("type", 0);
        ruleMap.put("color", 1);
        ruleMap.put("name", 2);
        int count = 0;
        int index = ruleMap.get(ruleKey);
        int size = items.size();
        for(int i = 0; i < size; i++) {
            if (items.get(i).get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}
