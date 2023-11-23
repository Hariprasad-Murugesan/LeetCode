package Dsa.leetcode;

class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if ( n <= 0){
            return false;
        }
        while (n % 3 ==0){
            n /= 3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        PowerOfThree sol = new PowerOfThree();
        boolean res = sol.isPowerOfThree(0);
        System.out.println(res);
    }
}