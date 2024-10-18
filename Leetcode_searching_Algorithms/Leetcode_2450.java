package Leetcode_searching_Algorithms;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2450 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,6};
        int [] nums2 = {2,3,4,5};

        System.out.println(getCommon2(nums1, nums2));

    }

    //my own method // run time error approach
    public static int getCommon(int [] nums1, int [] nums2){
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
        int [] ans = new int[set2.size()];
        int index = 0;

        for(int num: set2){
            ans[index++] = num;
        }

        int min_value = ans[0];
        for(int i = 0;i<ans.length;i++){
            if(ans[i] < min_value){
                min_value = ans[i];
            }
        }
        return min_value;
    }

    //method-2
    public static int getCommon2(int [] nums1, int [] nums2){

        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    return nums1[i];
                }
            }
        }
        return -1;
    }

    public static int getCommon3(int [] nums1, int [] nums2){
        Set<Integer> set = new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }

        for(int num: nums2){
            if(set.contains(num)){
                return num;
            }
        }

        return -1;
    }
}
