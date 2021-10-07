package Leetcode;

public class Question10 {
    public static void main(String[] args){
        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));

    }
    public static int compress(char[] chars) {
        if (chars.length == 0) return 0;
        char temp = chars[0];
        int index = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != temp) {
                chars[index++] = temp;
                temp = chars[i];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1;
                continue;
            }
            count++;
        }
        chars[index++] = chars[chars.length - 1];
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[index++] = c;
            }
        }
        return index;
    }
}
