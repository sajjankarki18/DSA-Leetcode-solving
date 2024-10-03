package Leetcodes_easy;

public class Leetcode_58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        String [] split_words = s.split(" ");
        String last_word = split_words[split_words.length - 1];
        int count = 0;

        for(int i = 0;i<last_word.length();i++){
            count++;
        }

        return count;
    }
}
