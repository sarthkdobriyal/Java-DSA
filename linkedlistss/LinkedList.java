package linkedlistss;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

         Node(int data){
            this.data= data;
            this.next = null;
        }

        Node(){

        }
        
    }

     Node head;
     Node tail;
     int size =0; 

    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAt(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node prev = head;
        int i=0;
        while(i < idx-1){
            prev = prev.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //Remove First Node
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove last node
    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        int i=0;
        while(i < size-2){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    //iterative Search key in LL
    public int itrSearch(int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }else{
                i++;
                temp = temp.next;
            }
        }
        return -1;
    }


    //REcursively Search any node
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }else{
            return 0;
        }
    }

    //TO reverse a LL
    public void reverse(){
        Node curr = head;
        Node prev = head;
        Node next = head.next;
        head.next = null;
        while(next != null ){
            curr = next;
            next = next.next;
            curr.next = prev;
            prev = curr;
        }
        head = prev;

    }

    //Delete nth Node from last
    public void deleteNthLast(int n){
        //Calculating size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //idx--> index of node from front to delete
        int idx = sz - n;
        //if n = size
        if(idx == 0){
            head = head.next;
            return;
        }
        int i =1;
        Node prev = head;
        while(i < idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //slow-fast Approach to find mid
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast !=null && fast.next !=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }





    //Check if a LL is Palindrome
    public boolean isLLPalindrome(){
        //get mid node
        Node midNode = findMid(head);

        //reverse from mid to end;
        Node prev = null;
        Node curr = midNode;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //CHecking if both halves are same
        Node left = head;
        Node right = prev;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;


    }

    //TO check for cycle in a LL
    public boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    //TO remove a cycle from LL
    public void removeCycle(Node head){
        //CHeck if cyclic
        Node slow = head; 
        Node fast = head; 
        boolean isCycle = false;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        
        //make slow -> head
        if(isCycle){
            slow = head;
            Node prev = null;
            //move slow and fast until they meet while storing prev of fast
            while(slow != fast){
                slow= slow.next;
                prev = fast;
                fast = fast.next;
            }
            //Make next of prev = null to break cycle
            prev.next = null;


        }


    }


    //Merge Sort Linked list
    private Node mergeSort(Node head){

        if(head == null || head.next == null  ){
            return head;
        }

        Node midNode = findMid(head);
        
        Node rightHead = midNode.next;
        midNode.next = null;
        Node lh = mergeSort(head);
        Node rh = mergeSort(rightHead);
        return merge(lh,rh);
    }

    //To merge two  sorted linkeedList
    private Node merge(Node lhead, Node rhead){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(lhead != null && rhead != null){
            if(lhead.data <= rhead.data){
                temp.next = lhead;
                lhead = lhead.next;
                temp = temp.next;
            }else{
                temp.next = rhead;
                rhead = rhead.next;
                temp = temp.next;
            }
        }

        while(lhead != null){
            temp.next = lhead;
            lhead = lhead.next;
            temp = temp.next;
        }
        while(rhead != null){
            temp.next = rhead;
            rhead = rhead.next;
            temp = temp.next;
        }

        return mergedLL.next;


    }


    private void zigzag(Node head){
        Node mid = findMid(head);
        

        //reverse half linkedlist
        Node prev = null;
        Node curr = mid;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node lp = head;
        Node rp = prev;

        while(rp != null && lp!=null){
            Node lpNext = lp.next;
            lp.next = rp;
            lp = lpNext;
            Node rpNext = rp.next;
            rp.next = lpNext;
            rp = rpNext;
        }



    }




    //To print our Linked list
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // ll.addLast(5);
        ll.print();
        
        ll.head = ll.mergeSort(ll.head);
        ll.zigzag(ll.head);
        ll.print();
        // System.out.println("is PAlindrome: " + ll.isLLPalindrome());
        // ll.reverse();
        // ll.deleteNthLast(3);
        
    }
}
