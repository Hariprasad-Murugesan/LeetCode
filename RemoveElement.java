package Dsa.leetcode;

class RemoveElement {
    public  int removeElement(int[] nums, int val) {
        int index = 0 ;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement res = new RemoveElement();
        int [] nums = {2,3,3,2};
        int val = 3;
        int sol = res.removeElement(nums,val);
        System.out.println(sol);
    }
}