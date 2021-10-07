package Leetcode;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int [] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
