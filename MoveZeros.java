package Dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

class MoveZeros {
    public  void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1 ; j< nums.length ; j++){
                if (nums [i] == 0 && nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums [j];
                    nums[j] =temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros sol = new MoveZeros();
        int[] nums = {1, 0, 2, 0, 3, 4, 0, 5};
        sol.moveZeroes(nums);
    }

}