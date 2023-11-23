package Dsa.leetcode;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        if (words.length == 0){
            return 0;
        }
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
       LengthOfLastWord sol = new LengthOfLastWord();
        String s = "luffy is still joyboy";
        int res = sol.lengthOfLastWord(s);
        System.out.println(res);

    }
}