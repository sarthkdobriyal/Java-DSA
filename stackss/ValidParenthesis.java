package stackss;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = ")()";
        if(isValid(s)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        int i=0;
        if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']'){
            return false;
        }
        while(i < s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else {
                char ch = s.charAt(i);
                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }else if(ch == '}' && st.peek() == '{'){
                    st.pop();
                }else if(ch == ']' && st.peek() == '['){
                    st.pop();
                }
            }
            i++;
        }
        
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        

    }

}
