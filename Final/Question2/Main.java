package Question2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strs =new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans1= getAnagram(strs);
        for (List<String> i: ans1){
            System.out.println(Arrays.toString(i.toArray()));
        }


        String[] test2=new String[]{"a","b"};
        List<List<String>> ans2= getAnagram(test2);
        for (List<String> i: ans2){
            System.out.println(Arrays.toString(i.toArray()));
        }


        String[] test3=new String[]{""};
        List<List<String>> ans3= getAnagram(test3);
        for (List<String> i: ans3){
            System.out.println(Arrays.toString(i.toArray()));
        }

    }
    static List<List<String>> getAnagram(String strs[]){
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> maps=new HashMap<>();
        for (String s: strs){
            char[] chs=s.toCharArray();
            Arrays.sort(chs);
            String copy=String.valueOf(chs);
            maps.putIfAbsent(copy,new ArrayList<String>());
            maps.get(copy).add(s);
        }
        for (List<String> list: maps.values()) ans.add(list);
        return ans;
    }
}
