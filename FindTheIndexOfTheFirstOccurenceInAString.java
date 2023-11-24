package Dsa.leetcode;

class FindTheIndexOfTheFirstOccurenceInAString {
    public static int strStr (String haystack, String needle) {
        int hay = haystack.length();
        int nee = needle.length();
        if (hay < nee){
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j=0;
            while (j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
                if (j==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        int index = strStr(haystack, needle);

        if (index == -1) {
            System.out.println("Needle not found");
        } else {
            System.out.println("Needle found at index: " + index);
        }
    }


}