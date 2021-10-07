package Leetcode;

public class Question9 {
    public static void main(String[] args){
        String s = "the sky is blue";
        String t = "hello      world";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(t));
    }
    public static String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=s1.length-1;i>=0;i--){
            if (s1[i].equals("")){
                continue;
            }
            stringBuffer.append(s1[i]);
            if (i>0){
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
