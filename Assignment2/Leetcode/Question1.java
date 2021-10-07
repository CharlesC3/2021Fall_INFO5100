package Leetcode;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args){
        int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = transpose(arr);
        for(int i = 0; i < 3; i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
    private static int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j = 0;j < A[i].length; j++){
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
