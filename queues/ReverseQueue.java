package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Reverse a queue


public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int num : arr){
            q.add(num);
        }
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }

    public static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }


    }

}
