package Question3;

import java.util.HashMap;

//Time complexity: O(N)
//Space complexity: O(N)

public class Main {
    public static void main(String[] args){
        int[] arr = {-1, -1, 0, 2, 5, 9, 3, 0, 2, 9 ,5};
        int nonRepeat = firstNonRepeatedInt(arr);
        if (nonRepeat == -1){
            System.out.println("There is no repeated number in the given array");
        }else{
            System.out.println("The first non repeated number is " + nonRepeat);
        }

    }// End of main function

    private static int firstNonRepeatedInt(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        for (int k: map.keySet()){
            if (map.get(k) == 1) {
                return k;
            }
        }
        return -1;
    }

}// end of class
