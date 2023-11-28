package Dsa.leetcode;

import java.util.HashSet;

class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> numberSet = new HashSet<>();
        // Iterate through nums and add each number to the HashSet
        for (int num : nums) {
            if (numberSet.contains(num)) {
                // If the number is already in the set, remove it
                numberSet.remove(num);
            } else {
                // Otherwise, add it to the set
                numberSet.add(num);
            }
        }

        // Convert the HashSet to an array
        int[] result = new int[numberSet.size()];
        int i = 0;
        for (int num : numberSet) {
            result[i++] = num;
        }

        return result;

    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {4, 5, 6, 7, 7, 6, 8, 9, 9};

        int[] result = new int[]{solution.singleNumber(nums)};

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}