package Question2;

import java.util.Arrays;

//Time complexity: O(N)
//Space complexity: O(N)

public class Main {
    public static void main(String[] args){
        int[] arr = {-12, -5, 0, 3, 10};
        System.out.println("The sorted square element array is "+ Arrays.toString(sortedSquare(arr)));
    }

    private static int[] sortedSquare(int[] nums){
        int len = nums.length;
        int begin = 0;
        int end = len - 1;
        int[] temp = new int [len];
        for (int i = len - 1; i > 0; i--){
            if (Math.abs(nums[begin]) < Math.abs(nums[end])){
                temp[i] = nums[end] * nums[end];
                end--;
            }else{
                temp[i] = nums[begin] * nums[begin];
                begin++;
            }
        }
        return temp;
    }
}// End of class

