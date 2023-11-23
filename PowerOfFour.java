package Dsa.leetcode;

class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if ( n <= 0 ){
            return false;
        }
        while (n % 4 ==0){
            n /= 4;
        }
        return n==1;

    }
    public static void main(String[] args) {
        PowerOfFour sol = new PowerOfFour();
        boolean res = sol.isPowerOfFour(1);
        System.out.println(res);
    }
}