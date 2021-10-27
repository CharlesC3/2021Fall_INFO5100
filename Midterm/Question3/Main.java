package Question3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,3,4,-1};
        int answer = sumOfRepeated(arr);
        System.out.println(answer);
    }

    private static int sumOfRepeated(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for(int num : count.keySet()) {
            if(count.get(num) > 1) {
                ans += num;
            }
        }
        return ans;
    }
}
