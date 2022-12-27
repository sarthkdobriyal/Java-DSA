package queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else {
                q2.add(data);
            }
        }

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }


        public int pop(){
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            if(!q1.isEmpty()){
                int i=0;
                while(i < q1.size()-1){
                    q2.add(q1.remove());
                }
                return q1.remove();
            }else{
                int i=0;
                while(i < q2.size()-1){
                    q1.add(q2.remove());
                }
                return q2.remove();
            }
        }

        public void print(){
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("Stack is empty");
                
            }
            if(!q1.isEmpty()){
                System.out.println(q1);
            }else{
            
                    System.out.println(q2);
            }
            
        }


        public int peek(){
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            if(!q1.isEmpty()){
                int i=0;
                while(i < q1.size()-1){
                    q2.add(q1.remove());
                }
                int val  =q1.peek();
                q2.add(q1.remove());
                return val;
            }else{
                int i=0;
                while(i < q2.size()-1){
                    q1.add(q2.remove());
                }
                int val  =q2.peek();
                q1.add(q2.remove());
                return val;
            }
        }



    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.print();



    }
}
