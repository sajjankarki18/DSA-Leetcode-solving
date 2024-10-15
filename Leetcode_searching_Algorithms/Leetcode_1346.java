package Leetcode_searching_Algorithms;

public class Leetcode_1346 {
    public static void main(String[] args) {
        int [] nums = {7,1,14,11};

        System.out.println(checkIfExist(nums));
    }
    public static boolean checkIfExist(int [] arr){

        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
