package Dsa.leetcode;

class Squareroot {
    public int mySqrt(int x) {
        double nums = Math.sqrt(x);
        return (int) nums;
    }

    public static void main(String[] args) {
        Squareroot sol = new Squareroot();
        int x =8;
        int res= sol.mySqrt(x);
        System.out.println(res);
    }
}