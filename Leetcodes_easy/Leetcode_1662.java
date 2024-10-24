package Leetcodes_easy;

public class Leetcode_1662 {
    public static void main(String[] args) {
        String [] words1 = {"abc", "d", "defg"};
        String [] words2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(words1, words2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newWord1 = "";
        String newWord2 = "";

        for(int i=0;i<word1.length;i++){
            newWord1 += word1[i];
        }

        for(int i=0;i<word2.length;i++){
            newWord2 += word2[i];
        }

        if(newWord1.equalsIgnoreCase(newWord2)){
            return true;
        }

        return false;
    }
}
