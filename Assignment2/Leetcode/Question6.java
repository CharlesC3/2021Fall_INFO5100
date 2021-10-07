package Leetcode;

public class Question6 {
    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        String u = "foo";
        String v = "bar";
        System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphic(u,v));
    }
    public static boolean isIsomorphic(String s, String t) {
        char[] s2t = new char[127];
        char[] t2s = new char[127];
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        int len = s.length();
        for (int i = 0;i < len;i ++){
            if (s2t[S[i]] != '\0' || t2s[T[i]] != '\0'){
                if (s2t[S[i]] != T[i]) return false;
            }else {
                s2t[S[i]] = T[i];
                t2s[T[i]] = S[i];
            }
        }

        return true;
    }
}
