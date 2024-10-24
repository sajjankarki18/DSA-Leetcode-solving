package Leetcodes_easy;

import java.util.HashSet;

public class Leetcode_2351 {
    public static void main(String[] args) {
        String s = "nwcn";

        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s){
        HashSet<Character> seen_letters = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char current_letter = s.charAt(i);

            if(seen_letters.contains(current_letter)){
                return current_letter;
            }

            seen_letters.add(current_letter);
        }

        return '\0';
    }
}
