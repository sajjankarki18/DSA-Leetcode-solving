package Leetcode_searchingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> list = new ArrayList<>();

       int max_candies = 0;

       for(int candy: candies){
           if(candy > max_candies){
               max_candies = candy;
           }
       }

       for(int candy: candies){
           if(candy + extraCandies >= max_candies){
               list.add(true);
           }else {
               list.add(false);
           }
       }

       return list;
    }
}
