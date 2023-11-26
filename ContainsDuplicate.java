package Dsa.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
 /*       Map<Integer, Integer> numsCount = new HashMap<>();
        for (int value :nums
             ) {
            numsCount.put(value,numsCount.getOrDefault(value,0)+1);
            if (numsCount.get(value)==2)  {
                return true;
            }
        }
        return false;*/

        Set<Integer> uniqueValues= new HashSet<>();
        for(int values : nums){
            if(!uniqueValues.add(values)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};

        if (containsDuplicate(values)) {
            System.out.println("Duplicates found!");
        } else {
            System.out.println("No duplicates.");
        }

    }
}