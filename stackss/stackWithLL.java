package stackss;

public class stackWithLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     Node head;
     int size;

    public void push(int data){
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }if(size == 1){
            int val = head.data;
            head = null;
            size=0;
            return  val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }





    public static void main(String[] args) {
        stackWithLL st = new stackWithLL();

        st.push(3);
        st.push(2);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ,size: ");
            System.out.println(st.size);
        }

    }
}
