package Dsa.leetcode;

class ValidPalindrom {


    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder cleanS = new StringBuilder();

        for (char c:s.toCharArray()
             ) {
            if (Character.isLetterOrDigit(c)){
                cleanS.append(Character.toLowerCase(c));
            }
        }
        int start =0 ;
        int end = cleanS.length()-1;
        while (start < end){
            if (cleanS.charAt(start) !=cleanS.charAt(end) ){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}