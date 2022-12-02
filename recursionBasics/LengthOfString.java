package recursionBasics;


//Question 3 :Write a program to find Length of a String using Recursion.



public class LengthOfString {
    public static void main(String[] args) {
        String s = "sarthak";
        System.out.println(length(s));
    }

    private static int length(String s) {
        if(s.length() == 0) return 0;

        return length(s.substring(1)) + 1;
    }
}
