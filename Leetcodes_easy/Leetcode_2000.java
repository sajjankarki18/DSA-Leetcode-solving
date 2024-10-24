package Leetcodes_easy;

public class Leetcode_2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));

    }

    public static String reversePrefix(String word, char ch) {

        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                return reverse(word, i);
            }
        }

        return word;
    }

    public static String reverse(String word, int index){
        String reveredStr = "";

        for(int i = index;i>=0;i--){
            reveredStr += word.charAt(i);
        }

        reveredStr+= word.substring(index + 1);

        return reveredStr;
    }

}
