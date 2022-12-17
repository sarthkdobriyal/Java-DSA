package linkedlistss;

import linkedlistss.LinkedList.Node;

//Question 4 :Odd Even Linked List
// We have a Linked List of integers,write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linkedlist.Also,keep the order of even and odd numbers same.
// Sample Input 1: 8->12->10->5->4->1->6->NULL
// Sample Output 1: 8->12->10->4->6->5->1->NULL

// Sample Input 2: 1->3->5->7->NULL
// Sample Output 2:1->3->5->7->NULL




public class EvenOddLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int arr[] = {8,10,12,4,5,1,3};
        for(int num: arr){
            ll.addLast(num);
        } 
        ll.print();
        
        Node evenHead = getEven(ll.head);
        Node oddHead = getOdd(ll.head);

        Node temp = evenHead;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = oddHead;

        ll.head = evenHead;
        ll.print();
    }

    private static Node getEven(Node head){
        Node EvenHead = new Node();
        Node temp = head;
        Node curr = EvenHead;

        while(temp != null){
            if(temp.data %2 == 0){
                curr.next = temp;
                temp = temp.next;
                curr = curr.next;
            }
        }

        return EvenHead.next;
    }

    private static Node getOdd(Node head){
        Node oddHead = new Node();
        Node temp = head;
        Node curr = oddHead;

        while(temp != null){
            if(temp.data %2 != 0){
                curr.next = temp;
                temp = temp.next;
                curr = curr.next;
            }
        }
        return oddHead.next;
    }

}
