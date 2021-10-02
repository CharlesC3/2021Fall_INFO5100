package Question1;

import java.util.HashMap;

//Time complexity: O(N)
//Space complexity: O(N)

public class Main {
    public static void main (String[] args){
        int[] arr = {1, 5, 3, 5, 1};
        int answer = uniqueSum(arr);
        System.out.println("The sum of all unique elements is " + answer);
    }// end of the main function

    private static int uniqueSum(int[] nums){
        int ans = 0;
        if (nums == null || nums.length == 0){
            return ans;
        }
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if  (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        for (int k: map.keySet()){
            if (map.get(k) == 1){
                ans += k;
            }
        }
        return ans;
    }// end of uniqueSum function

}// end of class