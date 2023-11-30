package Dsa.leetcode;

import java.util.EnumSet;
import java.util.HashMap;

class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans= 0;

        for (int numbers: nums
             ) {
            int numberCount = hm.getOrDefault(numbers,0);
            ans += numberCount;
            hm.put(numbers,numberCount+1);
        }
        return ans;


    }

    public static void main(String[] args) {
        NumberOfGoodPairs sol = new NumberOfGoodPairs();
        int[] nums = {1,1,1,1,1,1};
        int result = sol.numIdenticalPairs(nums);

        System.out.println("Number of Identical Pairs: " + result);
    }
}