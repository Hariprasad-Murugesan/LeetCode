package Dsa.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for (int number:nums
             ) {
            if (!set.add(number)) {
                set.remove(number);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        int[] nums = {4,1,2, 1,2};
        int result = sol.singleNumber(nums);

        System.out.println("Single number: " + result);
    }
}