package Question4;


//Time complexity: O(N)
//Space complexity: O(N)

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        String ransomNote = "ab";
        String magazine = "aab";
        if (canBeConstructed( ransomNote, magazine)){
            System.out.println("ransomNote can be constructed from magazine");
        }else{
            System.out.println("ransomNote can not be constructed from magazine");
        }

    }

    private static boolean canBeConstructed(String ran, String mag){
        if(ran.length() > mag.length()){
            return false;
        }
        HashMap <Character, Integer> map = new HashMap<>();
        for (char c : mag.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        for (char i : ran.toCharArray()){
            if (map.get(i) == 0){
                return false;
        }
            map.put(i, map.get(i) - 1);

        }
        return true;
    }
}
