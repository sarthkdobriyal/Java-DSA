package stackss;

import java.util.Stack;

//Given a valid string containing expressions
//FInd out if the given expression is contained inside duplicate pair of paranthesis


public class duplicateParenthesis {
    public static void main(String[] args) {
       String s = "(a+(b))";
        System.out.println(isDuplicate(s));
    }

    public static boolean isDuplicate(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count <1 ) return true;
                else st.pop();
            }else{
                st.push(ch);
            }
        }
        return false;

    }

}
