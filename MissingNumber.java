package Dsa.leetcode;

import java.util.HashMap;
import java.util.HashSet;

class MissingNumber {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();


        for (int num : nums
        ) {
            set.add(num);
        }


        for (int i = 1; i <= nums.length; i++) {


            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {1};
        int missingNumber = missingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}