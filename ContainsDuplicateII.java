package Dsa.leetcode;

import java.util.HashMap;

class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
      /*  HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i= 0; i< nums.length ; i++
             ) {
            if (map.containsKey(nums[i]) ){
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;*/
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
        }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1));  // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2));  // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3));
    }
}