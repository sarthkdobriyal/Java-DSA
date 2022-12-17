package linkedlistss;


//Question 3 :Swapping Nodes in a Linked List
// We have a linked list and two keys in it, swap nodes for two given keys.Nodes should be swapped by changing links.Swapping data of nodes may be expensive in many situations when data contains many fields. It may be assumed that all keys in the linked list are distinct.
// Sample Input 1: 1->2->3->4,  x = 2, y = 4
// Sample Output 1: 1->4->3->2








import linkedlistss.LinkedList.Node;

public class SwapTwoNodes {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int arr[] = {1,2,3,4};
        for(int num: arr){
            ll.addLast(num);
        }
        int x = 2;
        int y = 4;
        ll.print();
        swap(ll.head,x,y );
        ll.print();

    }

    private static void swap(Node head, int x, int y){
        Node swap1 = null;
        Node prev1 = head;
        Node next1 = null;
        Node swap2 = null;
        Node prev2 = head;
        Node next2 = null;

        int i=1;
        while(i<x-1){
            prev1 = prev1.next;
            i++;
        }
        swap1 = prev1.next;
        next1 = swap1.next;

        i=1;
        while(i<y-1){
            prev2 = prev2.next;
            i++;
        }
        swap2 = prev2.next;
        next2 = swap2.next;

        prev1.next = swap2;
        swap2.next = next1;
        prev2.next = swap1;
        swap1.next = next2;
    }
}
