package Leetcode_searching_Algorithms;

public class Leetcode_72 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int [][] matrix, int target){

        if(matrix.length == 0){
            return false;
        }

        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if( target == matrix[i][j]){
                    return true;
                }
            }
        }

        return false;
    }
}
