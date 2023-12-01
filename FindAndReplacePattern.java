package Dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern))
                list.add(word);
        }
        return list;
    }

    boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindAndReplacePattern sol = new FindAndReplacePattern();
        String pattern = "mee"; // Specify a pattern here
        String[] test = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        List<String> res = sol.findAndReplacePattern(test, pattern);

        System.out.println("Original Strings: " + Arrays.toString(test));
        System.out.println("Modified Strings: " + res);
    }
}
