package BasicsWithJava;

import java.util.Scanner;

public class checkReverseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        System.out.println(reverse(word));
        System.out.println(checkPalindrome(word));

    }
    public static String reverse(String word){
        String reversedWord = "";

        for(int i = word.length() - 1;i>=0;i--){
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }

    public static boolean checkPalindrome(String word){
        String reversedWord = "";
        String originalWord = word;

        for(int i = word.length() - 1;i>=0;i--){
            reversedWord += word.charAt(i);
        }

        if(originalWord == reversedWord){
            return true;
        }

        return false;
    }
}
