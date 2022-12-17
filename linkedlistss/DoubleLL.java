package linkedlistss;

//Doubly LinkedList implementation

public class DoubleLL {
    
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }   

    static Node head;
    static Node tail;
    static int size=0;
    

    //TO add at the starting
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //to add to the last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode; 
    }

    //to remove from start
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            size=0;
            head=tail=null;
            return val;
        }

        size--;
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    //To remove from last
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            size=0;
            head=tail=null;
            return val;
        }

        size--;
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    //To reverse a doubly LL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }




    //TO print the DoublyLL
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        // System.out.print("null<->");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        dll.reverse();
        dll.print();
        // System.out.println(dll.removeFirst());
        // System.out.println(dll.removeLast());
    }
}
