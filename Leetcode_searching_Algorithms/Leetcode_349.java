package Leetcode_searching_Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Leetcode_349 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    public static int [] intersection(int [] nums1, int [] nums2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num: nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int [] ans_array = new int[set2.size()];
        int index = 0;

        for(int num: set2){
            ans_array[index++] = num;
        }

        return ans_array;
    }
}
