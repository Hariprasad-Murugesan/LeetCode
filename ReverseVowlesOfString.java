package Dsa.leetcode;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowlesOfString {
    public static void main(String[] args) {
        // Example 1
        String s1 = "hello";
        String reversed1 = reverseVowels(s1);
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + reversed1);

        // Example 2
        String s2 = "leetcode";
        String reversed2 = reverseVowels(s2);
        System.out.println("Original: " + s2);
        System.out.println("Reversed: " + reversed2);
    }

    public static String reverseVowels(String s) {
        // Create a set of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Use two pointers to traverse from both ends
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Move the start pointer to the next vowel
            while (start < end && !vowels.contains(charArray[start])) {
                start++;
            }

            // Move the end pointer to the previous vowel
            while (start < end && !vowels.contains(charArray[end])) {
                end--;
            }

            // Swap vowels in place
            if (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        // Convert back to string
        return new String(charArray);
    }
}
