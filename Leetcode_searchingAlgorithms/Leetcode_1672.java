package Leetcode_searchingAlgorithms;

public class Leetcode_1672 {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int max_value = 0;

        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }

            if(max_value < sum){
                max_value = sum;
            }
        }
        return max_value;
    }
}
