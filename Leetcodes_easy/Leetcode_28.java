package Leetcodes_easy;

public class Leetcode_28 {
    public static void main(String[] args) {
        String haystack = "sadsadsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);

        return index;
    }
}
