package Dsa.leetcode;

class ShortestPalindrom {
    public String shortestPalindrome(String s) {
       /* if (s.isEmpty()){
            return "";
        }
        int ans =0;
        int start = 0;
        int end = s.length()-1;
        int i=0;
        int j =end;

        while (i<j){
            i= start;
            j= end-ans;

            while (s.charAt(i) != s.charAt(j)){
                ans++;
                j--;
            }
            if (s.charAt(i) == s.charAt(j)){
                while (s.charAt(i) == s.charAt(j)&& i<j){
                    i++;
                    j--;
                }
            }
            if (i<j){
                ans++;
            }
        }
        int m=s.length()-ans;
        String su = s.substring(m);
        StringBuilder reversedSu = new StringBuilder(su).reverse();
        return reversedSu.toString()+s;*/

        final String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < t.length(); ++i)
            if (s.startsWith(t.substring(i)))
                return t.substring(0, i) + s;
        return t + s;
    }

    public static void main(String[] args) {
        ShortestPalindrom res = new ShortestPalindrom();

        String test1 = "aacecaaa";
        String test2 = "abcd";

        // Test cases
        System.out.println("Shortest palindrome for " + test1 + ": " + res.shortestPalindrome(test1));
        System.out.println("Shortest palindrome for " + test2 + ": " + res.shortestPalindrome(test2));
    }
}

