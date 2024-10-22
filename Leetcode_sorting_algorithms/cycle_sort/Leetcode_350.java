package Leetcode_sorting_algorithms.cycle_sort;

import java.util.*;

public class Leetcode_350 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }
    public static int [] findIntersection(int [] nums1, int [] nums2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num: nums1){
            list1.add(num);
        }

        for(int num: nums2){
            if(list1.contains(num)){
                list2.add(num);
            }
        }

        int [] ans = new int[list2.size()];
        int index = 0;

        for(int num: list2){
            ans[index++] = num;
        }

        return ans;
    }
}
