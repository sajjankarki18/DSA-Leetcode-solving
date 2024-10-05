package Linear_search;

import java.util.Arrays;

public class searchTwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arr = {
                {12,56,19},
                {100, 78, 56},
                {67, 89, 96}
        };

        int target = 102;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int [] search(int [][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(target == arr[i][j]){
                    return new int[]{i, j}; //return indices where the element has been found, else return -1
                }
            }
        }

        return new int[]{-1,-1};
    }
}
