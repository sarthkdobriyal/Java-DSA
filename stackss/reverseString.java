package stackss;

import java.util.Stack;

//To reverse a string using stack


public class reverseString {
    public static void main(String[] args) {
        String s= "fuckyou";

        System.out.println(s);

        String revS = reverse(s);

        System.out.println(revS);
    }

    private static String reverse(String s){
        Stack<Character> st = new Stack<>();

        StringBuilder ans = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            st.push(s.charAt(i));
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();
    }
}
