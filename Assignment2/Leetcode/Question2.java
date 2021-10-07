package Leetcode;

public class Question2 {
    public static void main(String[] args){
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        String word3 = "makes";
        System.out.println(shortestDistance(wordsDict, word1, word2));
        System.out.println(shortestDistance(wordsDict, word1,word3));
    }
    public static int shortestDistance(String[] words, String word1, String word2){
        if(words == null || words.length == 0 || word1.equals(word2)){
            return 0;
        }
        int a = -1;
        int b = -1;
        int res = words.length;

        for(int i = 0; i< words.length; i++){
            if(words[i].equals(word1)){
                a = i;
                if(b != -1){
                    res = Math.min(res, a- b);
                }
            }
            if (words[i].equals(word2)){
                b = i;
                if(a != -1){
                    res = Math.min(res, b - a);
                }
            }
        }
        return res;
    }
}
