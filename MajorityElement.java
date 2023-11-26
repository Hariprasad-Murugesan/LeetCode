package Dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

class MajorityElement {
    public static int majorityElement(int[] nums) {
       int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        n=n/2;
        for (Map.Entry<Integer,Integer>entry:map.entrySet()
             ) {
            if (entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = majorityElement(nums);

        System.out.println("Majority Element: " + majorityElement);
    }
}