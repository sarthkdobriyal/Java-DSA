package stackss;

import java.util.Stack;

//TO push an element at the bottom of the stack using recursion in O(n) time and O(1)space.

public class PushAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        int data = 4;

        pushAtB(st, data);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }

    public static void pushAtB(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int val = st.pop();
        pushAtB(st, data);
        st.push(val);
    }
}
