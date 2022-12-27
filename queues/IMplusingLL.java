package queues;

public class IMplusingLL {


    public static  class Queue{


        public class Node{
            int data;
            Node next;
    
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static Node front;
        public static Node rear;

        public void add(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int peek(){
            if(front == null){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return front.data;
        }

        public int remove(){
            if(front == null){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            if(front == rear){
                int val = front.data;
                front = rear = null;
                return val;
            }
            int val = front.data;
            front = front.next;
            return val;
        }

        public boolean isEmpty(){
            return front == null;
        }
        
        public void print(){
            if(front == null){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }





    }




    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.print();

    }   
}
