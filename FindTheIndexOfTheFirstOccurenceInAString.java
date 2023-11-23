package Dsa.leetcode;

class FindTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        return null;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = strStr(haystack, needle);

        if (index == -1) {
            System.out.println("Needle not found");
        } else {
            System.out.println("Needle found at index: " + index);
        }
    }

}