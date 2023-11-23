package Dsa.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindPositionOfElement {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for ( int num:nums
             ) {
               list.add(num);
        }
        int index = list.indexOf(target);
        if (index != -1){
            return index;
        }else {
            list.add(target);
            Collections.sort(list);
            return list.indexOf(target);
        }
    }
    public static void main(String[] args) {
        FindPositionOfElement sol = new FindPositionOfElement();
        int [] nums = {1,3,5,6};
        int val = 5;
        int res = sol.searchInsert(nums,val);
        System.out.println(res);
    }
}