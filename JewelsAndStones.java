package Dsa.leetcode;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import static java.lang.reflect.Array.set;

class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
      /*  Set<Character> jewelSet = new HashSet<>();
        for (char jewel:jewels.toCharArray()
             ) {
            jewelSet.add(jewel);
        }
        int jewelCount = 0;
        for (char stone:stones.toCharArray()
        ) {
            if (jewelSet.contains(stone))
                 jewelCount++;
        }

        return jewelCount;*/

        int num = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i))!= -1){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        // Example usage:
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);
    }
}
