package Dsa.leetcode;

class UglyNumberI {
    public int nthUglyNumber(int n) {
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        int [] uglyNumber = new int[n];
        uglyNumber[0] = 1;

        int nextUglyIndex = 1;


        while (nextUglyIndex < n ){
            int nextUgly = Math.min(Math.min(uglyNumber[p2] * 2, uglyNumber[p3] * 3), uglyNumber[p5] * 5);
            uglyNumber[nextUglyIndex] = nextUgly;

            if (nextUgly == uglyNumber[p2] * 2) p2++;
            if (nextUgly == uglyNumber[p3] * 3) p3++;
            if (nextUgly == uglyNumber[p5] * 5) p5++;

            nextUglyIndex++;

        }

        return uglyNumber[n - 1] ;
    }

    public static void main(String[] args) {
        UglyNumberI uglyNumber = new UglyNumberI();
        System.out.println(uglyNumber.nthUglyNumber(10));  // Output: 12
        System.out.println(uglyNumber.nthUglyNumber(1));   // Output: 1
    }
}