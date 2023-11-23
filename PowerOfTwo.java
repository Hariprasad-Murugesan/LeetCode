package Dsa.leetcode;

class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
       if (n<= 0 ){
           return false;
       }
           return (n&(n-1))== 0;
    }

    public static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();
        boolean res = sol.isPowerOfTwo(3);
        System.out.println(res);
    }
}