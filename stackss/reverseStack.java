package stackss;

import java.util.Stack;

//To reverse a stack using recursiion in O(n) time and O(1) space.

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        reverse(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        PushAtBottomOfStack.pushAtB(s, top);
    }
}
