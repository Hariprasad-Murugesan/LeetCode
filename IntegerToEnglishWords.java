package Dsa.leetcode;

class IntegerToEnglishWords {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    public String numberToWords(int num) {
        if(num == 0){
           return "Zero";
        }
        int i=0;
        String words = "";

        while (num >0){
            if (num % 1000 != 0){
                words = helper(num % 1000) + THOUSANDS[i]+ " "+ words;
            num /=100;
            i++;
            }
        }
        return words.trim();

    }

    private String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return LESS_THAN_20[num] + " ";
        else if (num < 100) {
            int index = num / 10;
            if (index < TENS.length) {
                return TENS[index] + " " + helper(num % 10);
            } else {
                return ""; // Handle out-of-bounds gracefully
            }
        } else
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }


    public static void main(String[] args) {
        IntegerToEnglishWords converter = new IntegerToEnglishWords();

        // Example usage
        int num1 = 12345;
        int num2 = 987654321;

        System.out.println(num1 + " in words: " + converter.numberToWords(num1));
        System.out.println(num2 + " in words: " + converter.numberToWords(num2));
    }
}