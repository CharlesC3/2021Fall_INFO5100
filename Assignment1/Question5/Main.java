package Question5;

//Time complexity: O(N)
//Space complexity: O(1)

public class Main {
    public static void main(String[] args) {
        String example = "1A3d4s5t";

        if(checkString(example)) System.out.println("It's a correct string");
        else System.out.println("True String");

    }//End of main function

    private static boolean checkString(String s) {
        int len = s.length();
        boolean sign = false;
        char begin = s.charAt(0);
        sign = isLetter(begin) ;
        for(int i = 1; i < len; i++) {
            if(sign && isLetter(s.charAt(i))) return false;
            if(!sign && !isLetter(s.charAt(i))) return false;
        }
        return true;
    }

    private static boolean isLetter(Character c) {
        if((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) return true;
        else {
            return false;
        }
    }

}//End of the class

