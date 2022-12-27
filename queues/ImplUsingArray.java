package queues;

public class ImplUsingArray {

    public static class Queue{
        static int arr[];
        static int rear;
        static int front;
        static int size;

        Queue(int n){
            arr= new int[n];
            size = n;
            rear  = -1;
            front = -1;
        }

        public  boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public  void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear  = (rear+1)%size;
            arr[rear] = data;
        }

        public  int remove( ){
            if(rear == -1){
                System.out.println("Queue is empty");
                return Integer.MAX_VALUE;
            }
            int res = arr[0];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return res;
        }

        public  int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return Integer.MAX_VALUE;
            }
            return arr[front];
        }

        public  void print(){
            if(rear == -1){
                System.out.println("Queue is empty");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }


    }


    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        q.remove();


        q.print();
       
    }
}
