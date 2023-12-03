package Dsa.leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        // Example 1
        char[] str1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(str1);
        System.out.println("Reversed String 1: " + Arrays.toString(str1));

        // Example 2
        char[] str2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(str2);
        System.out.println("Reversed String 2: " + Arrays.toString(str2));
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move pointers
            start += 1;
            end -= 1;
        }
    }
}
