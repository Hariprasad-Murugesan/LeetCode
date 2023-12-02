package Dsa.leetcode;

import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if (pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (!charToWord.containsKey(currentChar)) {
                charToWord.put(currentChar,currentWord);
            }else {
                if (!charToWord.get(currentChar).equals(currentWord)){
                    return false;
                }
            }
        }



        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog")); // Should print true
        System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // Should print false
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog")); // Should print false
    }
}