package Dsa.leetcode;

import java.util.*;

import java.util.*;
class IntersectionOfTwoArrays {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // Populate maps with frequency of elements
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        // Find intersection with counts
        List<Integer> intersection = new ArrayList<>();
        for (int num : map1.keySet()) {
            int count = Math.min(map1.get(num), map2.getOrDefault(num, 0));
            for (int i = 0; i < count; i++) {
                intersection.add(num);
            }
        }

        // Convert the list to an array
        int[] result = new int[intersection.size()];
        int index = 0;

        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = findIntersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
