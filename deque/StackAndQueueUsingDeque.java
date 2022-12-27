package deque;
import java.util.*;

public class StackAndQueueUsingDeque {

    public static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int data){
            dq.addFirst(data);
        }

        public int pop(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }

        public void print(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(dq);
        }

    }
    public static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }

        public void print(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(dq);
        }

    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        s.pop();
        s.print();

        Queue q = new Queue();
        q.add(0);
        q.add(10);
        q.add(20);
        q.add(30);
        q.print();
        q.remove();
        q.remove();
        q.print();

    }
}
